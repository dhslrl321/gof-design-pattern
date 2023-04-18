package com.github.dhslrl321.example

interface UserRepository {
    fun save(user: User)

    fun findBy(id: Int): User
}