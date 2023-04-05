package com.audronf.theone.domain.usecase.characters

import com.audronf.theone.data.repository.characters.CharactersRepositoryImpl
import javax.inject.Inject

class FetchCharacters @Inject constructor(private val repository: CharactersRepositoryImpl) {

    suspend operator fun invoke() = repository.fetchCharacters()
}
