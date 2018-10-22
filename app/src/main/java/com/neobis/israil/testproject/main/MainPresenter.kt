package com.neobis.israil.testproject.main

import android.util.Log
import com.neobis.israil.testproject.StartApplication
import com.neobis.israil.testproject.models.Posts
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(val view:MainContract.View):MainContract.Presenter {

    override fun getPosts() {
        if (isViewAttached()) {
            StartApplication.service.getAllPosts().enqueue(object: Callback<Posts> {
                override fun onResponse(call: Call<Posts>?, response: Response<Posts>?) {
                    response!!.body()!!.title
                    if(isViewAttached()){
                        if(response!!.isSuccessful && response.body() != null){
                            view.onSuccessGetPosts(response.body()!!)

                            Log.d("Success","")
                        }
                        else{
                            Log.d("ERROR","ERROR")
                        }
                    }
                }


                override fun onFailure(call: Call<Posts>?, t: Throwable?) {
                }
            })


        }

    }

    private fun isViewAttached(): Boolean = view != null

}