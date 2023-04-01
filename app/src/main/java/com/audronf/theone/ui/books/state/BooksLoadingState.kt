package com.audronf.theone.ui.books.state

import androidx.compose.runtime.Composable
import com.audronf.theone.ui.components.Loading

class BooksLoadingState : BooksState {

    @Composable
    override fun UiState() {
        Loading()
    }

}
