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
import com.audronf.theone.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Book(book: Book) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = Dimen4dp),
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Swirl, contentColor = Kabul)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = Dimen16dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_book),
                contentDescription = book.name,
                modifier = Modifier.size(Dimen48dp)
            )
            Spacer(modifier = Modifier.width(Dimen16dp))
            Text(text = book.name, style = Typography.bodyLarge.copy(fontSize = TextSize20sp))
        }
    }
}
