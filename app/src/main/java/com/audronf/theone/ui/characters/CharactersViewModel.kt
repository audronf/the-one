package com.audronf.theone.ui.characters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.audronf.theone.domain.usecase.characters.FetchCharacters
import com.audronf.theone.networking.NetworkResponse
import com.audronf.theone.ui.characters.state.CharactersSuccessfulState
import com.audronf.theone.ui.state.ErrorState
import com.audronf.theone.ui.state.LoadingState
import com.audronf.theone.ui.state.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(private val useCase: FetchCharacters) : ViewModel() {

    private val _characters: MutableLiveData<UiState> = MutableLiveData()
    val characters: LiveData<UiState>
        get() = _characters

    fun fetchCharacters() {
        _characters.postValue(LoadingState())
        viewModelScope.launch {
            _characters.postValue(
                when (val req = useCase.invoke()) {
                    is NetworkResponse.Success -> {
                        req.response.body()?.let {
                            CharactersSuccessfulState(it)
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
