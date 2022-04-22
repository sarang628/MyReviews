package com.sarang.screen_myreviews.databinding;
import com.sarang.screen_myreviews.R;
import com.sarang.screen_myreviews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMyReviewBindingImpl extends ItemMyReviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tb_review, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMyReviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemMyReviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RatingBar) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.imageView5.setTag(null);
        this.ratingBar6.setTag(null);
        this.textView23.setTag(null);
        this.textView33.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.review == variableId) {
            setReview((com.example.torang_core.data.data.MyReview) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReview(@Nullable com.example.torang_core.data.data.MyReview Review) {
        this.mReview = Review;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.review);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.torang_core.data.data.MyReview review = mReview;
        java.lang.String reviewUploadDate = null;
        java.lang.String reviewContents = null;
        float reviewRating = 0f;
        java.lang.String reviewReviewImageUrl = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (review != null) {
                    // read review.uploadDate
                    reviewUploadDate = review.getUploadDate();
                    // read review.contents
                    reviewContents = review.getContents();
                    // read review.rating
                    reviewRating = review.getRating();
                    // read review.reviewImageUrl
                    reviewReviewImageUrl = review.getReviewImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.sarang.torangimageloader.ImageLoadBindingAdapter.loadReviewImage(this.imageView5, reviewReviewImageUrl);
            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.ratingBar6, reviewRating);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView23, reviewUploadDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView33, reviewContents);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): review
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}