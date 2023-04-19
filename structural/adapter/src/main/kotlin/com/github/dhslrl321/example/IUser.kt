package com.github.dhslrl321.example

import java.time.LocalDateTime

interface IUser {
    fun getId(): Long
    fun getName(): String
    fun getSerialNumber(): Long
    fun getRegisteredAt(): LocalDateTime
}