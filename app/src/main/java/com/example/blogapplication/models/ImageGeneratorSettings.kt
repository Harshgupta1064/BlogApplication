package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class ImageGeneratorSettings (

  @SerializedName("template" ) var template : String?  = null,
  @SerializedName("enabled"  ) var enabled  : Boolean? = null

)