package com.example.blogapplication

class BlogRepository {
    suspend fun fetchBlogPosts(): List<Blog> {
        return RetrofitClient.apiInterface.getBlogPosts()
    }
}
