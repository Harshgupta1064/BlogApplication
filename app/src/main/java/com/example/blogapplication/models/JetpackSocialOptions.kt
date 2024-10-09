package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class JetpackSocialOptions (

  @SerializedName("image_generator_settings" ) var imageGeneratorSettings : ImageGeneratorSettings? = ImageGeneratorSettings(),
  @SerializedName("version"                  ) var version                : Int?                    = null

)