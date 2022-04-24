package com.sarang.screen_myreviews;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/sarang/screen_myreviews/MyReviewsViewModel;", "Landroidx/lifecycle/ViewModel;", "myReviewsRepository", "Lcom/example/torang_core/repository/MyReviewsRepository;", "loginRepository", "Lcom/example/torang_core/repository/LoginRepository;", "(Lcom/example/torang_core/repository/MyReviewsRepository;Lcom/example/torang_core/repository/LoginRepository;)V", "_myReviewUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/torang_core/data/uistate/MyReviewUiState;", "myReviewItemsUiState", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/torang_core/data/uistate/MyReviewItemUiState;", "getMyReviewItemsUiState", "()Lkotlinx/coroutines/flow/Flow;", "myReviewUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getMyReviewUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadMyReviews", "", "restaurantId", "", "refreshMyReviews", "screen_myreviews_debug"})
public final class MyReviewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.torang_core.repository.MyReviewsRepository myReviewsRepository = null;
    private final com.example.torang_core.repository.LoginRepository loginRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.torang_core.data.uistate.MyReviewUiState> _myReviewUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.torang_core.data.uistate.MyReviewUiState> myReviewUiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.torang_core.data.uistate.MyReviewItemUiState>> myReviewItemsUiState = null;
    
    @javax.inject.Inject()
    public MyReviewsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.torang_core.repository.MyReviewsRepository myReviewsRepository, @org.jetbrains.annotations.NotNull()
    com.example.torang_core.repository.LoginRepository loginRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.torang_core.data.uistate.MyReviewUiState> getMyReviewUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.torang_core.data.uistate.MyReviewItemUiState>> getMyReviewItemsUiState() {
        return null;
    }
    
    /**
     * 내 리뷰 불러오기
     */
    public final void loadMyReviews(int restaurantId) {
    }
    
    public final void refreshMyReviews() {
    }
}