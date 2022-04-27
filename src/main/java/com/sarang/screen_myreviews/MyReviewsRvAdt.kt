package com.sarang.screen_myreviews

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.torang_core.data.data.MyReview
import com.example.torang_core.data.data.ReviewAndImage
import com.example.torang_core.navigation.WriteReviewNavigation
import com.sarang.screen_myreviews.MyReviewsVH.Companion.create

class MyReviewsRvAdt constructor(val writeReviewNavigation: WriteReviewNavigation) : RecyclerView.Adapter<MyReviewsVH>() {
    private var reviews: MutableList<ReviewAndImage> = ArrayList()
    private var items : List<MyReview> = ArrayList()
    private fun deleteReview(review: ReviewAndImage) {
        val position = getReviewPosition(review)
        if (position != -1) {
            reviews.removeAt(position)
            notifyItemRemoved(position)
        }
    }

    fun setReviews(reviews: List<ReviewAndImage>) {
        this.reviews = ArrayList(reviews)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyReviewsVH {
        return create(parent, writeReviewNavigation)
    }

    override fun onBindViewHolder(holder: MyReviewsVH, position: Int) {
        //holder.setReview(reviews[position])
        holder.setReview(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun updateReview(position: Int, review: ReviewAndImage) {
        if (position == -1) {
            reviews.add(0, review)
            notifyItemInserted(0)
        } else {
            reviews[position] = review
            notifyItemChanged(position)
        }
    }

    private fun getReviewPosition(review: ReviewAndImage): Int {
        val position = -1
        for (i in reviews.indices) {
        }
        return position
    }

    fun updateReview(review: ReviewAndImage) {
        val position = getReviewPosition(review)
        if (position != -1) {
            reviews[position] = review
            notifyItemChanged(position)
        }
        reviews.add(0, review)
        notifyItemChanged(0)
    }

    fun setItems(it: List<MyReview>) {
        items = it
        notifyDataSetChanged()
    }
}