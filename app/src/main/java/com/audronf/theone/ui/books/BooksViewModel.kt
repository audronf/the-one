package com.audronf.theone.ui.books

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.audronf.theone.domain.usecase.books.FetchBooks
import com.audronf.theone.networking.NetworkResponse
import com.audronf.theone.ui.books.state.BooksSuccessfulState
import com.audronf.theone.ui.state.ErrorState
import com.audronf.theone.ui.state.LoadingState
import com.audronf.theone.ui.state.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BooksViewModel @Inject constructor(private val useCase: FetchBooks) : ViewModel() {

    private val _books: MutableLiveData<UiState> = MutableLiveData()
    val books: LiveData<UiState>
        get() = _books

    fun fetchBooks() {
        _books.postValue(LoadingState())
        viewModelScope.launch {
            _books.postValue(
                when (val req = useCase.invoke()) {
                    is NetworkResponse.Success -> {
                        req.response.body()?.let {
                            BooksSuccessfulState(it.data)
                        }
                    }
                    else -> {
                        ErrorState()
                    }
                }
            )
        }
    }
}
