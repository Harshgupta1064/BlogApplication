package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class TargetHints (

  @SerializedName("allow" ) var allow : ArrayList<String> = arrayListOf()

)