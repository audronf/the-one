package com.audronf.theone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.audronf.theone.navigation.Navigation
import com.audronf.theone.ui.theme.Sandrift
import com.audronf.theone.ui.theme.Swirl
import com.audronf.theone.ui.theme.TheOneTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheOneTheme {
                // A surface container using the 'background' color from the theme
                Scaffold {
                    Column(modifier = Modifier.padding(it)) {
                        Navigation()
                    }
                }
            }
        }
    }
}
