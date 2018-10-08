package com.innocv.androidcodetest.domain

import java.io.Serializable

class User(
        val id: String,
        val name: String,
        val birthdate: String
): Serializable