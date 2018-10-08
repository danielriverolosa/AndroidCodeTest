package com.innocv.androidcodetest.data.datasource.api.user

import com.innocv.androidcodetest.data.datasource.api.user.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface UserApi {

    @GET("user/getall")
    fun getUsers(): Call<List<UserResponse>>

}