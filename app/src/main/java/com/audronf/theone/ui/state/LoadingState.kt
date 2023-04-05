package com.audronf.theone.ui.state

import androidx.compose.runtime.Composable
import com.audronf.theone.ui.components.Loading

class LoadingState : UiState {

    @Composable
    override fun DrawUiState() {
        Loading()
    }
}
