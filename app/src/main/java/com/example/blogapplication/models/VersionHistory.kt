package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class VersionHistory (

@SerializedName("count")
var count: Int? = null,
@SerializedName("href")
var href: String? = null

)