package com.neobis.israil.testproject

import com.neobis.israil.testproject.models.Posts
import retrofit2.Call
import retrofit2.http.GET

interface ForumService {
    @GET("/posts")
    fun getAllPosts():Call<MutableList<Posts>>
}