package com.audronf.theone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.audronf.theone.R
import com.audronf.theone.domain.model.movies.MovieDetail
import com.audronf.theone.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Movie(movieDetail: MovieDetail) {
    with(movieDetail) {
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = Dimen4dp),
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Swirl, contentColor = Kabul)
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(vertical = Dimen8dp, horizontal = Dimen8dp)
            ) {
                Text(text = name, style = Typography.bodyLarge)
                Text(
                    text = stringResource(id = R.string.movie_budget_revenue, formattedBudget, formattedRevenue),
                    style = Typography.bodySmall
                )
                Text(
                    text = stringResource(id = R.string.academy_awards, academyAwardWins),
                    style = Typography.bodySmall
                )
                Text(
                    text = stringResource(
                        id = R.string.rotten_tomatoes_score,
                        formattedScore
                    ), style = Typography.bodySmall
                )
            }
        }
    }
}
