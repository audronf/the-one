package com.audronf.theone.domain.model.books

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("_id") val id: String,
    @SerializedName("name") val name: String
)

data class BookResponse(
    @SerializedName("docs") val data: List<Book>
)