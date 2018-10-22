package com.neobis.israil.testproject.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.neobis.israil.testproject.R
import com.neobis.israil.testproject.models.Posts

class MainActivity : AppCompatActivity(),MainContract.View {
    lateinit var presenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    init()
}

    private fun init() {
        presenter = MainPresenter(this)
        presenter.getPosts()

}

    override fun onSuccessGetPosts(body: Posts) {
        Log.d("Success",presenter.toString())
}
}
