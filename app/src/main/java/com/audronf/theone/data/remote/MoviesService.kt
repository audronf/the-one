package com.audronf.theone.data.remote

import com.audronf.theone.domain.model.movies.MoviesResponse
import retrofit2.Response
import retrofit2.http.GET

interface MoviesService {

    @GET("movie")
    suspend fun getMovies(): Response<MoviesResponse>
}
