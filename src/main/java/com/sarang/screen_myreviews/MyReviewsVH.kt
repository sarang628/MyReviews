package com.sarang.screen_myreviews

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.torang_core.data.data.MyReview
import com.example.torang_core.data.data.ReviewAndImage
import com.example.torang_core.navigation.WriteReviewNavigation
import com.example.torang_core.util.Logger
import com.sarang.screen_myreviews.databinding.ItemMyReviewBinding

class MyReviewsVH(
    private val itemMyReviewBinding: ItemMyReviewBinding,
    val writeReviewNavigation: WriteReviewNavigation
) :
    RecyclerView.ViewHolder(
        itemMyReviewBinding.root
    ) {
    private var review: ReviewAndImage? = null
    private var myReview: MyReview? = null

    init {
        val context = itemMyReviewBinding.root.context
        itemMyReviewBinding.imageView5.setOnClickListener {
            goModifyReview(context)
        }
        itemMyReviewBinding.textView23.setOnClickListener {
            goModifyReview(context)
        }
        itemMyReviewBinding.clMyReviewContainer.setOnClickListener {
            goModifyReview(context)
        }
        itemMyReviewBinding.tbReview.setOnMenuItemClickListener {
            false
        }
    }

    fun goModifyReview(context: Context) {
        myReview?.review_id?.let { writeReviewNavigation.go(context, it) }
    }

    fun setReview(review: ReviewAndImage?) {
        this.review = review
        //itemMyReviewBinding.review = review
    }

    fun setReview(review: MyReview) {
        myReview = review
        itemMyReviewBinding.review = review
    }

    companion object {
        @JvmStatic
        fun create(parent: ViewGroup, writeReviewNavigation: WriteReviewNavigation): MyReviewsVH {
            val myReviewsVh = MyReviewsVH(
                ItemMyReviewBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ), writeReviewNavigation
            )
            return myReviewsVh
        }
    }

    init {
        itemMyReviewBinding.tbReview.inflateMenu(R.menu.menu)
    }
}