package com.audronf.theone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.audronf.theone.domain.model.characters.CharacterData
import com.audronf.theone.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Character(
    character: CharacterData
) {
    with(character) {
        Card(
            shape = RoundedCornerShape(Dimen8dp),
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Swirl, contentColor = Kabul)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimen8dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = name,
                        style = Typography.labelLarge.copy(fontWeight = FontWeight.Bold)
                    )
                    if (gender == "male") {
                        Image(
                            painter = painterResource(id = com.audronf.theone.R.drawable.ic_male),
                            contentDescription = stringResource(id = com.audronf.theone.R.string.male),
                            colorFilter = ColorFilter.tint(
                                Kabul
                            )
                        )
                    } else if (gender == "female") {
                        Image(
                            painter = painterResource(id = com.audronf.theone.R.drawable.ic_female),
                            contentDescription = stringResource(id = com.audronf.theone.R.string.female),
                            colorFilter = ColorFilter.tint(
                                Kabul
                            )
                        )
                    }
                }
                if (realm.isNotBlank()) LabeledText(
                    label = stringResource(id = com.audronf.theone.R.string.realm),
                    text = realm
                )
                LabeledText(
                    label = stringResource(id = com.audronf.theone.R.string.race),
                    text = race
                )
            }
        }
    }
}

@Composable
@Preview
fun CharacterPreview(
    character: CharacterData = CharacterData(
        id = "id",
        "Name",
        "1",
        "Race",
        "male",
        "birth",
        "spouse",
        "death",
        "realm",
        "hair",
        "wikiUrl",
    )
) {
    Character(character)
}
