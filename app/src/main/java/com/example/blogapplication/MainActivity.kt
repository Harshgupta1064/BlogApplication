package com.example.blogapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use 'viewModels()' to initialize the ViewModel
        val blogRepository = BlogRepository()
        val blogViewModel = BlogViewModel(blogRepository)
        // Fetch blogs from ViewModel
        blogViewModel.fetchBlogs()

        // Set up the UI
        setContent {
            MyApp {
                BlogScreen(blogViewModel = blogViewModel)
            }
        }
    }

    // App layout and theme
    @Composable
    fun MyApp(content: @Composable () -> Unit) {
        MaterialTheme {
            Surface(modifier = Modifier.fillMaxSize()) {
                content()
            }
        }
    }
}

// Main screen displaying blogs
@Composable
fun BlogScreen(blogViewModel: BlogViewModel) {
    // Get context using LocalContext
    val context = LocalContext.current

    // Observe the blogs LiveData from BlogViewModel
    val blogs by blogViewModel.blogPosts.observeAsState(initial = emptyList())
    val isLoading by blogViewModel.isLoading.observeAsState(initial = true)
    val errorMessage by blogViewModel.errorMessage.observeAsState(initial = null)

    // Handling loading, error, and content states
    when {
        isLoading -> {
            LoadingScreen()
        }
        errorMessage != null -> {
            ErrorScreen(errorMessage)
        }
        blogs.isNotEmpty() -> {
            BlogList(blogs = blogs) { blog ->
                // Handle blog item click (optional)
                // Use 'context' here if you want to perform actions with the current context
            }
        }
        else -> {
            EmptyScreen()
        }
    }
}

// Loading state composable
@Composable
fun LoadingScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator()
    }
}

// Error state composable
@Composable
fun ErrorScreen(errorMessage: String?) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = errorMessage ?: "Unknown error", color = Color.Red)
    }
}

// Empty state composable (optional)
@Composable
fun EmptyScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "No blogs available")
    }
}

// Blog list composable using LazyColumn
@Composable
fun BlogList(blogs: List<Blog>, onItemClick: (Blog) -> Unit) {
    Column {
        HeaderBox()
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(blogs) { blog ->
                BlogItem(blog, onItemClick)
            }
        }
    }
}

// Header composable
@Composable
fun HeaderBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(color = Color.DarkGray),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Blog Application",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
        )
    }
}

// Single blog item row
@Composable
fun BlogItem(blog: Blog, onItemClick: (Blog) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onItemClick(blog) }, // Trigger click to open details
        elevation = CardDefaults.cardElevation(8.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            // Image and blog details (adjust based on your actual blog content)
            Column {
                Text(text = blog.title.toString())
                Text(text = blog.date.toString())

            }
        }
    }
}
