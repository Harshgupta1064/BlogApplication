package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class WpTerm(

    @SerializedName("taxonomy") var taxonomy: String? = null,
    @SerializedName("embeddable") var embeddable: Boolean? = null,
    @SerializedName("href") var href: String? = null

)