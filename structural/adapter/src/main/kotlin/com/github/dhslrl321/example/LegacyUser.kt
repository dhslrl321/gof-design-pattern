package com.github.dhslrl321.example

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

private const val REGEX_PATTERN =
    "(19|20)\\d{2}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])(0[0-9]|1[0-9]|2[0-3])([0-5][0-9])([0-5][0-9])"

class LegacyUser(
    private val seq: String,
    private val name: String,
    private val grpId: Long,
    private val teamId: Long,
    private val regDtt: String,
) : IUser {
    override fun getId(): Long = seq.toLong()

    override fun getName(): String = name

    override fun getSerialNumber(): Long = grpId.toString().plus(teamId.toString()).toLong()

    override fun getRegisteredAt(): LocalDateTime {
        if (Regex(REGEX_PATTERN).containsMatchIn(regDtt).not()) {
            throw IllegalStateException("regDtt 가 yyyyMMdd 형식이 아닙니다")
        }

        return LocalDateTime.parse(regDtt, DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))
    }

}