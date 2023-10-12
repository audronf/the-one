package com.audronf.theone.domain.repository.movies

import com.audronf.theone.domain.model.movies.MoviesResponse
import com.audronf.theone.networking.NetworkResponse
import retrofit2.Response

interface MoviesRepository {

    suspend fun fetchMovies(): NetworkResponse<Response<MoviesResponse>>
}
