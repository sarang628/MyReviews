package com.sarang.screen_myreviews

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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

    init {

        viewModelScope.launch {
            _myReviewUiState.update {
                delay(300)
                it.copy(isLogin = true)
            }
        }

        viewModelScope.launch {
            _myReviewUiState.update {
                delay(300)
                it.copy(isLoading = true)
            }
        }

        viewModelScope.launch {
            _myReviewUiState.update {
                delay(300)
                it.copy(list = ArrayList(), isLoading = false)
            }
        }
    }

    fun loadMyReviews(restaurantId: Int) {

    }

    fun getViewReview(restaurantId: Int): LiveData<List<ReviewAndImage>> {
        return MutableLiveData(ArrayList())
    }

    fun refreshMyReviews() {
        viewModelScope.launch {
            _myReviewUiState.update {
                it.copy(list = ArrayList(), isLoading = true)
            }
        }
        viewModelScope.launch {
            _myReviewUiState.update {
                it.copy(list = ArrayList(), isLoading = false)
            }
        }
    }

}