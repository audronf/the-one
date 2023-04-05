package com.audronf.theone.domain.usecase.books

import com.audronf.theone.data.repository.books.BooksRepositoryImpl
import com.audronf.theone.domain.model.books.BookResponse
import com.audronf.theone.networking.NetworkResponse
import retrofit2.Response
import javax.inject.Inject

class FetchBooks @Inject constructor(private val repository: BooksRepositoryImpl) {

    suspend operator fun invoke(): NetworkResponse<Response<BookResponse>> =
        repository.fetchBooks()
}
