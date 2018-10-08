package com.innocv.androidcodetest.data.repository.user

import com.innocv.androidcodetest.data.datasource.api.user.model.UserResponse
import com.innocv.androidcodetest.domain.User
import com.innocv.androidcodetest.presentation.base.utils.parseDate

fun UserResponse.mapToDomain(): User = User(
        id,
        name,
        birthdate.parseDate()
)