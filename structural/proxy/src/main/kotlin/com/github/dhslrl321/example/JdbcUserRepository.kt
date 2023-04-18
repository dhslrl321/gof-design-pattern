package com.github.dhslrl321.example

import java.time.Instant
import java.time.LocalDateTime
import java.util.UUID

class JdbcUserRepository(private val dataSource: DataSource): UserRepository {
    override fun save(user: User) {
        dataSource.insertCall()
    }

    override fun findBy(id: Int): User {
        dataSource.selectCall()
        val generatedId = Instant.EPOCH.toEpochMilli().toInt()
        return User(generatedId, UUID.randomUUID().toString())
    }
}