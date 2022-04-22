package com.sarang.screen_myreviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0014\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\u001d\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007J\u000e\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\u0016\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/sarang/screen_myreviews/MyReviewsRvAdt;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sarang/screen_myreviews/MyReviewsVH;", "writeReviewNavigation", "Lcom/example/torang_core/navigation/WriteReviewNavigation;", "(Lcom/example/torang_core/navigation/WriteReviewNavigation;)V", "items", "", "Lcom/example/torang_core/data/data/MyReview;", "reviews", "", "Lcom/example/torang_core/data/data/ReviewAndImage;", "getWriteReviewNavigation", "()Lcom/example/torang_core/navigation/WriteReviewNavigation;", "deleteReview", "", "review", "getItemCount", "", "getReviewPosition", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "it", "setReviews", "updateReview", "screen_myreviews_debug"})
public final class MyReviewsRvAdt extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sarang.screen_myreviews.MyReviewsVH> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.torang_core.navigation.WriteReviewNavigation writeReviewNavigation = null;
    private java.util.List<com.example.torang_core.data.data.ReviewAndImage> reviews;
    private java.util.List<com.example.torang_core.data.data.MyReview> items;
    
    public MyReviewsRvAdt(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.navigation.WriteReviewNavigation writeReviewNavigation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.torang_core.navigation.WriteReviewNavigation getWriteReviewNavigation() {
        return null;
    }
    
    private final void deleteReview(com.example.torang_core.data.data.ReviewAndImage review) {
    }
    
    public final void setReviews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.torang_core.data.data.ReviewAndImage> reviews) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sarang.screen_myreviews.MyReviewsVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sarang.screen_myreviews.MyReviewsVH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateReview(int position, @org.jetbrains.annotations.NotNull()
    com.example.torang_core.data.data.ReviewAndImage review) {
    }
    
    private final int getReviewPosition(com.example.torang_core.data.data.ReviewAndImage review) {
        return 0;
    }
    
    public final void updateReview(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.data.data.ReviewAndImage review) {
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.torang_core.data.data.MyReview> it) {
    }
}