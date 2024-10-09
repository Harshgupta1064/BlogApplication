package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class Excerpt (

  @SerializedName("rendered"  ) var rendered  : String?  = null,
  @SerializedName("protected" ) var protected : Boolean? = null

)