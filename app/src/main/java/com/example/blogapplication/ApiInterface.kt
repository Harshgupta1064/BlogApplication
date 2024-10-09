package com.example.blogapplication

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("wp-json/wp/v2/posts")
    suspend fun getBlogPosts(
        @Query("per_page") perPage: Int = 10,
        @Query("page") page: Int = 1
    ): List<Blog>
}



