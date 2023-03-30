package com.audronf.theone.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.audronf.theone.R
import com.audronf.theone.navigation.Routes
import com.audronf.theone.ui.components.HomeButton
import com.audronf.theone.ui.theme.Typography

@Composable
fun Home(navHostController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = stringResource(id = R.string.app_name), style = Typography.headlineLarge)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            HomeButton(
                iconId = R.drawable.ic_book,
                textId = R.string.books_title
            ) { navHostController.navigate(Routes.BOOKS) }
            HomeButton(
                iconId = R.drawable.ic_movie,
                textId = R.string.movies_title
            ) { navHostController.navigate(Routes.MOVIES) }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            HomeButton(
                iconId = R.drawable.ic_quote,
                textId = R.string.quotes_title
            ) { navHostController.navigate(Routes.QUOTES) }
            HomeButton(
                iconId = R.drawable.ic_character,
                textId = R.string.characters_title
            ) { navHostController.navigate(Routes.CHARACTERS) }
        }
    }
}
