package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class Self(

    @SerializedName("href") var href: String? = null,
    @SerializedName("targetHints") var targetHints: TargetHints? = TargetHints()

)