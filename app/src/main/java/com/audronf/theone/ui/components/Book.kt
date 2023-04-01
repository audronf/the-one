package com.audronf.theone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.audronf.theone.R
import com.audronf.theone.domain.model.books.Book
import com.audronf.theone.ui.theme.Kabul
import com.audronf.theone.ui.theme.Swirl
import com.audronf.theone.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Book(book: Book) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Swirl, contentColor = Kabul)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_book),
                contentDescription = book.name,
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = book.name, style = Typography.bodyLarge.copy(fontSize = 20.sp))
        }
    }
}
