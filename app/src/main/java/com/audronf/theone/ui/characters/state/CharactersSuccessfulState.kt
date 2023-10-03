package com.audronf.theone.ui.characters.state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.audronf.theone.domain.model.characters.CharactersResponse
import com.audronf.theone.ui.components.Character
import com.audronf.theone.ui.state.UiState
import com.audronf.theone.ui.theme.Dimen16dp
import com.audronf.theone.ui.theme.Dimen4dp
import com.audronf.theone.ui.theme.Dimen8dp

class CharactersSuccessfulState(private val charactersResponse: CharactersResponse) :
    UiState {

    @Composable
    override fun DrawUiState() {
        LazyColumn(
            modifier = Modifier.padding(horizontal = Dimen8dp, vertical = Dimen16dp),
            verticalArrangement = Arrangement.spacedBy(
                Dimen4dp
            )
        ) {
            items(charactersResponse.data) {
                Character(character = it)
            }
        }
    }
}
