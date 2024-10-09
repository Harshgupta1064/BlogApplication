package com.example.blogapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BlogViewModel(private val blogRepository: BlogRepository) : ViewModel() {

    // LiveData to handle loading state
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    // LiveData to handle error messages
    private val _errorMessage = MutableLiveData<String?>()
    val errorMessage: LiveData<String?> = _errorMessage
    // Private MutableLiveData to hold the blog posts
    private val _blogPosts = MutableLiveData<List<Blog>>()

    // Public LiveData to expose the blog posts to the UI
    val blogPosts: LiveData<List<Blog>> = _blogPosts

    // Function to fetch blogs and update LiveData
    fun fetchBlogs() {
        viewModelScope.launch {
            // Fetch blog posts from the repository
            val blogs = blogRepository.fetchBlogPosts()

            // Update the MutableLiveData
            _blogPosts.value = blogs
        }
    }
}
