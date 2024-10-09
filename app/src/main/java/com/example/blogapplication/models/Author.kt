package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class Author(

    @SerializedName("embeddable") var embeddable: Boolean? = null,
    @SerializedName("href") var href: String? = null

)