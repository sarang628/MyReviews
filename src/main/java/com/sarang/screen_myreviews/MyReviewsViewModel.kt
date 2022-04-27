package com.sarang.screen_myreviews

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.torang_core.repository.LoginRepository
import com.example.torang_core.repository.MyReviewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyReviewsViewModel @Inject constructor(
    private val myReviewsRepository: MyReviewsRepository,
    private val loginRepository: LoginRepository
) :
    ViewModel() {
    private val _myReviewUiState = MutableStateFlow(MyReviewUiState())
    val myReviewUiState: StateFlow<MyReviewUiState> = _myReviewUiState.asStateFlow()

    init {
        viewModelScope.launch {
            loginRepository.isLoginFlow().collect { count ->
                _myReviewUiState.update {
                    //count 유무에 따라 로그인 상태 처리
                    it.copy(isLogin = (count > 0))
                }
            }
        }
    }

    fun refreshMyReviews(restaurantId: Int) {
        viewModelScope.launch {
            _myReviewUiState.update {
                it.copy(isLoading = true, isfirstLoading = true)
            }
        }
        viewModelScope.launch {
            _myReviewUiState.update {
                it.copy(
                    isLoading = false,
                    list = myReviewsRepository.getMyReviews3(restaurantId)
                )
            }
        }
    }
}