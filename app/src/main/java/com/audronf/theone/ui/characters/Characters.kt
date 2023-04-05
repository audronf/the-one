package com.audronf.theone.ui.characters

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Characters(
    viewModel: CharactersViewModel
) {
    Text(text = "Characters")
    viewModel.fetchCharacters()
}
