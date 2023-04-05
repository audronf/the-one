package com.audronf.theone.domain.repository.characters

import com.audronf.theone.domain.model.characters.CharactersResponse
import com.audronf.theone.networking.NetworkResponse
import retrofit2.Response

interface CharactersRepository {
    suspend fun fetchCharacters(): NetworkResponse<Response<CharactersResponse>>
}
