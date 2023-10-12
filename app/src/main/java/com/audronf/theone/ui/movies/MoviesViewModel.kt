package com.audronf.theone.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.audronf.theone.domain.usecase.movies.FetchMovies
import com.audronf.theone.networking.NetworkResponse
import com.audronf.theone.ui.movies.state.MoviesSuccessfulState
import com.audronf.theone.ui.state.ErrorState
import com.audronf.theone.ui.state.LoadingState
import com.audronf.theone.ui.state.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(private val useCase: FetchMovies) : ViewModel() {

    private val _movies: MutableLiveData<UiState> = MutableLiveData()
    val movies: LiveData<UiState>
        get() = _movies

    fun fetchMovies() {
        _movies.postValue(LoadingState())
        viewModelScope.launch {
            _movies.postValue(
                when (val req = useCase.invoke()) {
                    is NetworkResponse.Success -> {
                        req.response.body()?.let {
                            MoviesSuccessfulState(it)
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
