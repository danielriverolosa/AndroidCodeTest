package com.innocv.androidcodetest.data.datasource.api.user

import com.innocv.androidcodetest.data.datasource.api.user.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UserApi {

    @GET("user/getall")
    fun getUsers(): Call<List<UserResponse>>

    @POST("user/create")
    fun create(@Body userResponse: UserResponse): Call<UserResponse>

}