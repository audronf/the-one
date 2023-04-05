package com.audronf.theone.ui.characters.state

import androidx.compose.runtime.Composable
import com.audronf.theone.domain.model.characters.CharactersResponse
import com.audronf.theone.ui.state.UiState

class CharactersSuccessfulState(private val charactersResponse: CharactersResponse) :
    UiState {

    @Composable
    override fun DrawUiState() {
        
    }
}
