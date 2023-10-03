package com.audronf.theone.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.audronf.theone.ui.theme.Dimen4dp
import com.audronf.theone.ui.theme.Typography

@Composable
fun LabeledText(
    label: String,
    text: String
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(text = "$label:", style = Typography.labelSmall.copy(fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.width(Dimen4dp))
        Text(text = text, style = Typography.bodySmall)
    }
}
