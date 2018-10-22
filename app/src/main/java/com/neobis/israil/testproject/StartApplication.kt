package com.neobis.israil.testproject

import android.app.Application
import com.neobis.israil.testproject.data.Network

class StartApplication:Application() {
    private val BASE_URL = "http://jsonplaceholder.typicode.com"
    companion object {
        @Volatile
        lateinit var service:ForumService
    }

    override fun onCreate() {
        super.onCreate()
        service = Network.initService(BASE_URL)
    }

}