package com.innocv.androidcodetest.data.repository.user

import com.innocv.androidcodetest.data.datasource.api.ApiClientGenerator
import com.innocv.androidcodetest.data.datasource.api.user.UserApi
import com.innocv.androidcodetest.data.repository.BaseRepository
import com.innocv.androidcodetest.domain.User
import com.innocv.androidcodetest.domain.repository.UserRepository
import javax.inject.Inject

class UserDataRepository @Inject constructor(
        private val apiClientGenerator: ApiClientGenerator
): BaseRepository(), UserRepository {

    override fun getUserList(): List<User> {
        val userApi = apiClientGenerator.generateApi(UserApi::class.java)
        val call = userApi.getUsers()

        return executeCall(call).map { it.mapToDomain() }
    }

    override fun getUserById(id: String): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createUser(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateUser(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeUser(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}