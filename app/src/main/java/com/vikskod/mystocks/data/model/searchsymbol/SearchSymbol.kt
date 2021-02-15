package com.vikskod.mystocks.data.model.searchsymbol


import com.google.gson.annotations.SerializedName

data class SearchSymbol(
    @SerializedName("bestMatches")
    val bestMatches: List<BestMatches>
)