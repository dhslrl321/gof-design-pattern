package com.github.dhslrl321.example

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import java.time.LocalDateTime

class UserRepositoryTest: BehaviorSpec({
    given("repository 에 서로 다른 타입의 user setting") {
        val users = listOf(
            LegacyUser("1", "jang", 999, 333, "19980123"),
            LegacyUser("2", "kim", 999, 444, "19991103"),
            User(3, "hong", 19457, LocalDateTime.now()),
            User(4, "hong", 19457, LocalDateTime.now()),
        )

        val sut = UserRepository(users)

        `when`("전체를 조회했을 때") {

            val actual = sut.findAll()

            then("adapting 된 객체가 반환") {
                actual.size shouldBe 4
                actual[0].getSerialNumber() shouldBe 999333
            }
        }
    }

})