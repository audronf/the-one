package com.audronf.theone.ui.books.state

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.audronf.theone.R
import com.audronf.theone.domain.model.books.Book
import com.audronf.theone.ui.components.Book
import com.audronf.theone.ui.state.UiState
import com.audronf.theone.ui.theme.Typography

class BooksSuccessfulState(private val books: List<Book>) : UiState {

    @Composable
    override fun DrawUiState() {
        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 32.dp)) {
            Text(text = stringResource(id = R.string.books_title), style = Typography.headlineLarge)
            Spacer(modifier = Modifier.height(32.dp))
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(books) {
                    Book(book = it)
                }
            }
        }
    }
}
