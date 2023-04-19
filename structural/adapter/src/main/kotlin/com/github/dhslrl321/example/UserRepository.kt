package com.github.dhslrl321.example

import java.util.Objects

class UserRepository(
    private val users: List<IUser>,
) {

    fun findAll(): List<IUser> {
        return users;
    }
}