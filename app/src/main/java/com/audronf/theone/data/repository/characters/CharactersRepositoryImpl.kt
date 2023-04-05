package com.audronf.theone.data.repository.characters

import com.audronf.theone.data.remote.CharactersService
import com.audronf.theone.domain.model.characters.CharactersResponse
import com.audronf.theone.domain.repository.characters.CharactersRepository
import com.audronf.theone.networking.NetworkRequestHandler
import com.audronf.theone.networking.NetworkResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(private val service: CharactersService) :
    CharactersRepository {

    override suspend fun fetchCharacters(): NetworkResponse<Response<CharactersResponse>> =
        withContext(Dispatchers.IO) {
            NetworkRequestHandler.safeServiceCall { service.fetchCharacters() }
        }
}
