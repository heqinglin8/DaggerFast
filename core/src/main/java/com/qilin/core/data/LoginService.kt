package com.qilin.core.data

import android.content.ClipData
import com.qilin.core.data.model.LoggedInUser
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query


interface LoginService {

    @POST("user/{login}/")
     suspend fun login(
        @Path("login") username: String,
        @Query("uid") uid: String
    ): LoggedInUser

    @POST("category/{cat}/")
    suspend fun categoryList(
        @Path("cat") category: String,
        @Query("page") page: Int
    ): List<ClipData.Item>

}