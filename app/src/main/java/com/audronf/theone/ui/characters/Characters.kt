package com.audronf.theone.ui.characters

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun Characters(
    viewModel: CharactersViewModel
) {
    val charactersState by viewModel.characters.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.fetchCharacters()
    }

    charactersState?.DrawUiState()
}
