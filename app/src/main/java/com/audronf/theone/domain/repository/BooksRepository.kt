package com.audronf.theone.domain.repository

import com.audronf.theone.domain.model.books.BookResponse
import com.audronf.theone.networking.NetworkResponse
import retrofit2.Response

interface BooksRepository {

    suspend fun fetchBooks(): NetworkResponse<Response<BookResponse>>
}
