package com.audronf.theone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.audronf.theone.ui.books.Books
import com.audronf.theone.ui.books.BooksViewModel
import com.audronf.theone.ui.characters.Characters
import com.audronf.theone.ui.home.Home
import com.audronf.theone.ui.movies.Movies
import com.audronf.theone.ui.quotes.Quotes

@Composable
fun Navigation(
    booksViewModel: BooksViewModel
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.HOME) {

        composable(Routes.HOME) {
            Home(navController)
        }

        composable(Routes.BOOKS) {
            Books(booksViewModel)
        }

        composable(Routes.MOVIES) {
            Movies()
        }

        composable(Routes.QUOTES) {
            Quotes()
        }

        composable(Routes.CHARACTERS) {
            Characters()
        }
    }
}
