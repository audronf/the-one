package com.audronf.theone.data.remote

import com.audronf.theone.domain.model.characters.CharactersResponse
import retrofit2.Response
import retrofit2.http.GET

interface CharactersService {

    @GET("character")
    suspend fun fetchCharacters(): Response<CharactersResponse>
}
