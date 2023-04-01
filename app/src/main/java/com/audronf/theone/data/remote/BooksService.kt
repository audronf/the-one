package com.audronf.theone.data.remote

import com.audronf.theone.domain.model.books.BookResponse
import retrofit2.Response
import retrofit2.http.GET

interface BooksService {

    @GET("book")
    suspend fun fetchBooks(): Response<BookResponse>
}
