package com.audronf.theone.domain.usecase.movies

import com.audronf.theone.data.repository.movies.MoviesRepositoryImpl
import javax.inject.Inject

class FetchMovies @Inject constructor(private val repository: MoviesRepositoryImpl) {

    suspend operator fun invoke() = repository.fetchMovies()
}
