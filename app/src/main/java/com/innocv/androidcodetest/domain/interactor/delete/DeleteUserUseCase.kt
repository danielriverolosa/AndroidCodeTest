package com.innocv.androidcodetest.domain.interactor.delete

import com.innocv.androidcodetest.domain.User
import com.innocv.androidcodetest.domain.interactor.UseCase
import com.innocv.androidcodetest.domain.repository.UserRepository

class DeleteUserUseCase (
        private val userRepository: UserRepository
    ): UseCase<Unit, User>() {

    override fun runInBackground(params: User) {
        //TODO: Implement functionality
    }

}