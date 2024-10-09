package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class Curies (

  @SerializedName("name"      ) var name      : String?  = null,
  @SerializedName("href"      ) var href      : String?  = null,
  @SerializedName("templated" ) var templated : Boolean? = null

)