package com.audronf.theone.ui.movies

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun Movies(
    viewModel: MoviesViewModel
) {
    val moviesState by viewModel.movies.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.fetchMovies()
    }

    moviesState?.DrawUiState()
}
