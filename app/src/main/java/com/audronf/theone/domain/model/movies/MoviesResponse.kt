package com.audronf.theone.domain.model.movies

import com.audronf.theone.extension.toFormattedAmount
import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("docs") val movies:List<MovieDetail>
)

data class MovieDetail(
    @SerializedName("_id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("runtimeInMinutes") val runtimeInMinutes: Float,
    @SerializedName("budgetInMillions") val budget: Float,
    @SerializedName("boxOfficeRevenueInMillions") val revenue: Float,
    @SerializedName("academyAwardNominations") val academyAwardNominations: Int,
    @SerializedName("academyAwardWins") val academyAwardWins: Int,
    @SerializedName("rottenTomatoesScore") val rottenTomatoesScore: Float
) {
    val formattedBudget: String
        get() = budget.toFormattedAmount()

    val formattedRevenue: String
        get() = revenue.toFormattedAmount()

    val formattedScore: String
        get() = rottenTomatoesScore.toFormattedAmount()
}
