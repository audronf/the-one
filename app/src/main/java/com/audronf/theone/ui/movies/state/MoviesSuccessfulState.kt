package com.audronf.theone.ui.movies.state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.audronf.theone.domain.model.movies.MoviesResponse
import com.audronf.theone.ui.components.Movie
import com.audronf.theone.ui.state.UiState
import com.audronf.theone.ui.theme.Dimen16dp
import com.audronf.theone.ui.theme.Dimen8dp

class MoviesSuccessfulState(private val content: MoviesResponse) : UiState {

    @Composable
    override fun DrawUiState() {
        LazyColumn(
            modifier = Modifier.padding(start = Dimen8dp, end = Dimen8dp, top = Dimen16dp),
            verticalArrangement = Arrangement.spacedBy(
                Dimen8dp
            )
        ) {
            items(content.movies) {
                Movie(movieDetail = it)
            }
        }
    }
}
