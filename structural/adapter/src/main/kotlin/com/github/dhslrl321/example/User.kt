package com.github.dhslrl321.example

import java.time.LocalDateTime

class User(
    private val id: Long,
    private val name: String,
    private val serialNumber: Long,
    private val registeredAt: LocalDateTime
) : IUser {

    override fun getId(): Long = id

    override fun getName(): String = name

    override fun getSerialNumber(): Long = serialNumber

    override fun getRegisteredAt(): LocalDateTime = registeredAt
}