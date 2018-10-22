package com.neobis.israil.testproject.main

import com.neobis.israil.testproject.models.Posts

interface MainContract {
    interface View{
        fun onSuccessGetPosts(body: Posts)
    }
    interface Presenter{
        fun getPosts()
    }
}