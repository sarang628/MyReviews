package com.sarang.screen_myreviews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.torang_core.*
import com.example.torang_core.data.uistate.isEmpty
import com.example.torang_core.navigation.LoginNavigation
import com.example.torang_core.navigation.WriteReviewNavigation
import com.example.torang_core.util.Logger
import com.sarang.screen_myreviews.databinding.FragmentMyReviewsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

/**
 * [MyReviewsRvAdt]
 * [MyReviewsVH]
 * [ItemMyReviewBinding]
 * [FragmentMyReviewsBinding]
 */

@AndroidEntryPoint
class MyReviewsFragment : Fragment() {
    @Inject
    lateinit var loginNavigation: LoginNavigation // 로그인 내비게이션

    @Inject
    lateinit var writeReviewNavigation: WriteReviewNavigation // 리뷰 작성 내비게이션
    //private val viewModel: MyReviewsViewModel by viewModels() // 리뷰 리스트 뷰 모델
    private val viewModel: TestMyReviewViewModel by viewModels() // 리뷰 리스트 뷰 모델
    private lateinit var myReviewRvAdt: MyReviewsRvAdt // 리뷰 리사이클러뷰 아답터

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMyReviewsBinding.inflate(layoutInflater, container, false)

        myReviewRvAdt = MyReviewsRvAdt(writeReviewNavigation)

        binding.recyclerView2.adapter = myReviewRvAdt
        //내 리뷰 추가 버튼 클릭
        binding.btnAddMyReview.setOnClickListener {
            requireActivity().intent?.let {
                writeReviewNavigation.go(requireContext(), it.getIntExtra("restaurantId", -1))
            }
        }
        subscribeUi(binding)
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.myReviewUiState.collect {
                    Logger.d("")
                    binding.isLogin = it.isLogin
                    binding.slReviews.isRefreshing = it.isLoading
                    it.list?.let { myReviewRvAdt.setItems(it) }
                    binding.tvEmpty.visibility = if (it.isEmpty) View.VISIBLE else View.INVISIBLE
                }
            }
        }

        binding.btnLogin.setOnClickListener {
            loginNavigation.goLogin(requireContext())
        }

        binding.slReviews.setOnRefreshListener {
            viewModel.refreshMyReviews()
        }
        return binding.root
    }

    private fun subscribeUi(binding: FragmentMyReviewsBinding) {
        requireActivity().intent?.let {
            val restaurantId = it.getIntExtra("restaurantId", 1)
            if (restaurantId != -1) {
                viewModel.loadMyReviews(restaurantId)
                viewModel.getViewReview(restaurantId).observe(viewLifecycleOwner) {
                    myReviewRvAdt.setReviews(it)
                }
            }
        }
    }
}