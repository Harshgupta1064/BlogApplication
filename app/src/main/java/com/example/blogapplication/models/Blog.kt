package com.example.blogapplication

import com.google.gson.annotations.SerializedName

data class Blog(

    @SerializedName("id") var id: Int? = null,
    @SerializedName("date") var date: String? = null,
    @SerializedName("date_gmt") var dateGmt: String? = null,
    @SerializedName("guid") var guid: Guid? = Guid(),
    @SerializedName("modified") var modified: String? = null,
    @SerializedName("modified_gmt") var modifiedGmt: String? = null,
    @SerializedName("slug") var slug: String? = null,
    @SerializedName("status") var status: String? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("link") var link: String? = null,
    @SerializedName("title") var title: Title? = Title(),
    @SerializedName("content") var content: Content? = Content(),
    @SerializedName("excerpt") var excerpt: Excerpt? = Excerpt(),
    @SerializedName("author") var author: Int? = null,
    @SerializedName("featured_media") var featuredMedia: Int? = null,
    @SerializedName("comment_status") var commentStatus: String? = null,
    @SerializedName("ping_status") var pingStatus: String? = null,
    @SerializedName("sticky") var sticky: Boolean? = null,
    @SerializedName("template") var template: String? = null,
    @SerializedName("format") var format: String? = null,
    @SerializedName("meta") var meta: Meta? = Meta(),
    @SerializedName("categories") var categories: ArrayList<Int> = arrayListOf(),
    @SerializedName("tags") var tags: ArrayList<Int> = arrayListOf(),
    @SerializedName("class_list") var classList: ArrayList<String> = arrayListOf(),
    @SerializedName("jetpack_publicize_connections") var jetpackPublicizeConnections: ArrayList<String> = arrayListOf(),
    @SerializedName("aioseo_notices") var aioseoNotices: ArrayList<String> = arrayListOf(),
    @SerializedName("jetpack_featured_media_url") var jetpackFeaturedMediaUrl: String? = null,
    @SerializedName("jetpack_likes_enabled") var jetpackLikesEnabled: Boolean? = null,
    @SerializedName("jetpack_sharing_enabled") var jetpackSharingEnabled: Boolean? = null,
    @SerializedName("jetpack_shortlink") var jetpackShortlink: String? = null,
    @SerializedName("jetpack-related-posts") var jetpackRelatedPosts: ArrayList<String> = arrayListOf(),
    @SerializedName("_links") var links: Links? = Links()

)


