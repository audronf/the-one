package com.audronf.theone.data.repository.books

import com.audronf.theone.data.remote.BooksService
import com.audronf.theone.domain.model.books.BookResponse
import com.audronf.theone.domain.repository.books.BooksRepository
import com.audronf.theone.networking.NetworkRequestHandler
import com.audronf.theone.networking.NetworkResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class BooksRepositoryImpl @Inject constructor(private val service: BooksService) : BooksRepository {

    override suspend fun fetchBooks(): NetworkResponse<Response<BookResponse>> =
        withContext(Dispatchers.IO) {
            NetworkRequestHandler.safeServiceCall { service.fetchBooks() }
        }
}
