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
import com.audronf.theone.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeButton(
    iconId: Int,
    textId: Int,
    action: () -> Unit
) {
    Card(
        onClick = action,
        shape = RoundedCornerShape(Dimen8dp),
        modifier = Modifier.size(Dimen144dp),
        colors = CardDefaults.cardColors(containerColor = Swirl, contentColor = Kabul)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(Dimen8dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = iconId),
                contentDescription = stringResource(id = textId),
                modifier = Modifier.size(Dimen80dp),
                colorFilter = ColorFilter.tint(color = Kabul)
            )
            Spacer(modifier = Modifier.height(Dimen8dp))
            Text(text = stringResource(id = textId), style = Typography.labelLarge)
        }
    }
}