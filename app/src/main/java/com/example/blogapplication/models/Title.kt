package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class Title(

    @SerializedName("rendered") var rendered: String? = null

)