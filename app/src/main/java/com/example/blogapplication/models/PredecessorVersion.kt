package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class PredecessorVersion (

@SerializedName("id")
var id: Int? = null,
@SerializedName("href")
var href: String? = null

)