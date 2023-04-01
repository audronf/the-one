package com.audronf.theone.ui.books.state

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.audronf.theone.domain.model.books.Book

class BooksSuccessfulState(private val books: List<Book>) : BooksState {

    @Composable
    override fun UiState() {
        books.forEach { Text(text = it.name) }
    }
}
