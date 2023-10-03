package com.audronf.theone.domain.model.characters

import com.google.gson.annotations.SerializedName

data class CharacterData(
    @SerializedName("_id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("height") val height: String,
    @SerializedName("race") val race: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("birth") val birth: String,
    @SerializedName("spouse") val spouse: String,
    @SerializedName("death") val death: String,
    @SerializedName("realm") val realm: String,
    @SerializedName("hair") val hair: String,
    @SerializedName("wikiUrl") val wikiUrl: String
) {
    val isAlive: Boolean
        get() = death.isNotBlank()
}

data class CharactersResponse(
    @SerializedName("docs") val data: List<CharacterData>
)
