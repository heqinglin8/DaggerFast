package com.qilin.daggerfast.data

import android.content.ClipData
import com.qilin.daggerfast.data.model.LoggedInUser
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query


interface LoginService {

    @POST("user/{login}/")
     suspend fun login(
        @Path("login") username: String,
        @Query("uid") uid: String
    ): Call<LoggedInUser>

    @POST("category/{cat}/")
    suspend fun categoryList(
        @Path("cat") category: String,
        @Query("page") page: Int
    ): Call<List<ClipData.Item>>

}