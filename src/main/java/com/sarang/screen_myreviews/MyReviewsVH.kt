package com.sarang.screen_myreviews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.torang_core.data.data.MyReview
import com.example.torang_core.data.data.ReviewAndImage
import com.example.torang_core.navigation.WriteReviewNavigation
import com.sarang.screen_myreviews.databinding.ItemMyReviewBinding

class MyReviewsVH(
    private val itemMyReviewBinding: ItemMyReviewBinding,
    writeReviewNavigation: WriteReviewNavigation
) :
    RecyclerView.ViewHolder(
        itemMyReviewBinding.root
    ) {
    private var review: ReviewAndImage? = null
    private var myReview: MyReview? = null

    init {
        itemMyReviewBinding.imageView5.setOnClickListener { v ->
            review?.also {
                /*val bundle = bundleOf("review_id" to it.review.review_id);
                v.findNavController()
                    .navigate(
                        MyReviewNavigation.action_myReviewsFragment_to_myReviewFragment,
                        bundle
                    )*/

                val context = itemMyReviewBinding.root.context
                it.review?.let { writeReviewNavigation.go(context, it.review_id) }

            }
        }
        itemMyReviewBinding.textView23.setOnClickListener {
        }
        itemMyReviewBinding.clMyReviewContainer.setOnClickListener {
        }
        itemMyReviewBinding.tbReview.setOnMenuItemClickListener {
            false
        }
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