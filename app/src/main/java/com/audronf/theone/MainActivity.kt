package com.audronf.theone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.audronf.theone.navigation.Navigation
import com.audronf.theone.ui.books.BooksViewModel
import com.audronf.theone.ui.characters.CharactersViewModel
import com.audronf.theone.ui.theme.Sandrift
import com.audronf.theone.ui.theme.Swirl
import com.audronf.theone.ui.theme.TheOneTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val booksViewModel: BooksViewModel by viewModels()
    private val charactersViewModel: CharactersViewModel by viewModels()

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheOneTheme {
                Scaffold {
                    Column(modifier = Modifier.padding(it)) {
                        Navigation(
                            booksViewModel,
                            charactersViewModel
                        )
                    }
                }
            }
        }
    }
}
