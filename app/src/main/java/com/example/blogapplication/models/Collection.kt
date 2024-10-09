package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class Collection(

    @SerializedName("href") var href: String? = null

)