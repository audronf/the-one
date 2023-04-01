package com.audronf.theone.ui.books

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun Books(booksViewModel: BooksViewModel) {
    val booksState by booksViewModel.books.observeAsState()

    LaunchedEffect(Unit) {
        booksState ?: booksViewModel.fetchBooks()
    }

    booksState?.UiState()
}
