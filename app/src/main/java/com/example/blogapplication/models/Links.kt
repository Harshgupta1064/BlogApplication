package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class Links(

    @SerializedName("self") var self: ArrayList<Self> = arrayListOf(),
    @SerializedName("collection") var collection: ArrayList<Collection> = arrayListOf(),
    @SerializedName("about") var about: ArrayList<About> = arrayListOf(),
    @SerializedName("author") var author: ArrayList<Author> = arrayListOf(),
    @SerializedName("replies") var replies: ArrayList<Replies> = arrayListOf(),
    @SerializedName("version-history") var versionHistory: ArrayList<VersionHistory> = arrayListOf(),
    @SerializedName("predecessor-version") var predecessorVersion: ArrayList<PredecessorVersion> = arrayListOf(),
    @SerializedName("wpFeaturedmedia") var wpFeaturedmedia :ArrayList<WpFeaturedmedia> = arrayListOf(),
    @SerializedName("wpAttachment") var wpAttachment : ArrayList<WpAttachment> = arrayListOf(),
    @SerializedName("wpTerm") var wpTerm : ArrayList<WpTerm> = arrayListOf(),
    @SerializedName("curies") var curies: ArrayList<Curies> = arrayListOf()

)