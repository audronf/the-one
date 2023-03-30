package com.audronf.theone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.audronf.theone.ui.theme.Kabul
import com.audronf.theone.ui.theme.Sandrift
import com.audronf.theone.ui.theme.Swirl
import com.audronf.theone.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeButton(
    iconId: Int,
    textId: Int,
    action: () -> Unit
) {
    Card(onClick = action, shape = RoundedCornerShape(8.dp), modifier = Modifier.size(144.dp), colors = CardDefaults.cardColors(containerColor = Swirl, contentColor = Kabul)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = iconId),
                contentDescription = stringResource(id = textId),
                modifier = Modifier.size(80.dp),
                colorFilter = ColorFilter.tint(color = Kabul)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = stringResource(id = textId), style = Typography.labelLarge)
        }
    }
}