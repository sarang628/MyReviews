package com.sarang.screen_myreviews

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.torang_core.data.data.MyReview
import com.example.torang_core.data.data.ReviewAndImage
import com.example.torang_core.data.uistate.MyReviewUiState
import com.example.torang_core.util.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestMyReviewViewModel @Inject constructor() : ViewModel() {
    private val _myReviewUiState = MutableStateFlow(MyReviewUiState())
    val myReviewUiState: StateFlow<MyReviewUiState> = _myReviewUiState.asStateFlow()
    var loading = false;

    fun loadMyReviews(restaurantId: Int) {
        viewModelScope.launch {
            _myReviewUiState.update {
                delay(300)
                it.copy(isLoading = true)
            }
        }

        if (!loading)
            viewModelScope.launch {
                _myReviewUiState.update {
                    delay(1000)
                    it.copy(list = ArrayList(), isLoading = false)
                }
            }

        if (loading)
            viewModelScope.launch {
                _myReviewUiState.update {
                    delay(1000)
                    it.copy(
                        isLoading = false,
                        list = ArrayList<MyReview>().apply {
                            add(
                                MyReview(
                                    review_id = 0,
                                    rating = 3.0f,
                                    contents = "맛있어요",
                                    reviewImageUrl = "44/469/08:02:11.512/08:02:11.512.png"
                                )
                            )
                            add(
                                MyReview(
                                    review_id = 0,
                                    rating = 3.0f,
                                    contents = "맛있어요",
                                    reviewImageUrl = "44/469/08:02:11.512/08:02:11.512.png"
                                )
                            )
                            add(
                                MyReview(
                                    review_id = 0,
                                    rating = 3.0f,
                                    contents = "맛있어요",
                                    reviewImageUrl = "44/469/08:02:11.512/08:02:11.512.png"
                                )
                            )
                            add(
                                MyReview(
                                    review_id = 0,
                                    rating = 3.0f,
                                    contents = "맛있어요",
                                    reviewImageUrl = "44/469/08:02:11.512/08:02:11.512.png"
                                )
                            )
                            add(
                                MyReview(
                                    review_id = 0,
                                    rating = 3.0f,
                                    contents = "맛있어요",
                                    reviewImageUrl = "44/469/08:02:11.512/08:02:11.512.png"
                                )
                            )
                            add(
                                MyReview(
                                    review_id = 0,
                                    rating = 3.0f,
                                    contents = "맛있어요",
                                    reviewImageUrl = "44/469/08:02:11.512/08:02:11.512.png"
                                )
                            )
                            add(
                                MyReview(
                                    review_id = 0,
                                    rating = 3.0f,
                                    contents = "맛있어요",
                                    reviewImageUrl = "44/469/08:02:11.512/08:02:11.512.png"
                                )
                            )
                            add(
                                MyReview(
                                    review_id = 0,
                                    rating = 3.0f,
                                    contents = "맛있어요",
                                    reviewImageUrl = "44/469/08:02:11.512/08:02:11.512.png"
                                )
                            )
                            add(
                                MyReview(
                                    review_id = 0,
                                    rating = 3.0f,
                                    contents = "맛있어요",
                                    reviewImageUrl = "44/469/08:02:11.512/08:02:11.512.png"
                                )
                            )
                        })
                }
            }

        loading = !loading
    }

    fun login() {
        viewModelScope.launch {
            _myReviewUiState.update {
                delay(300)
                it.copy(isLogin = true)
            }
        }
    }

    fun refreshMyReviews(restaurantId: Int) {
        loadMyReviews(10)
    }

}