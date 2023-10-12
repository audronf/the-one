package com.audronf.theone.data.repository.movies

import com.audronf.theone.data.remote.MoviesService
import com.audronf.theone.domain.model.movies.MoviesResponse
import com.audronf.theone.domain.repository.movies.MoviesRepository
import com.audronf.theone.networking.NetworkRequestHandler
import com.audronf.theone.networking.NetworkResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(private val service: MoviesService) :
    MoviesRepository {

    override suspend fun fetchMovies(): NetworkResponse<Response<MoviesResponse>> =
        withContext(Dispatchers.IO) {
            NetworkRequestHandler.safeServiceCall { service.getMovies() }
        }
}
