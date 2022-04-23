package com.sarang.screen_myreviews;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/sarang/screen_myreviews/TestMyReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_myReviewUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/torang_core/data/uistate/MyReviewUiState;", "myReviewUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getMyReviewUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getViewReview", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/torang_core/data/data/ReviewAndImage;", "restaurantId", "", "loadMyReviews", "", "refreshMyReviews", "screen_myreviews_debug"})
public final class TestMyReviewViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.torang_core.data.uistate.MyReviewUiState> _myReviewUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.torang_core.data.uistate.MyReviewUiState> myReviewUiState = null;
    
    @javax.inject.Inject()
    public TestMyReviewViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.torang_core.data.uistate.MyReviewUiState> getMyReviewUiState() {
        return null;
    }
    
    public final void loadMyReviews(int restaurantId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.torang_core.data.data.ReviewAndImage>> getViewReview(int restaurantId) {
        return null;
    }
    
    public final void refreshMyReviews() {
    }
}