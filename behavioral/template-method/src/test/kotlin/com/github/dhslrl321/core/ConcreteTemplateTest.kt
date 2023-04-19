package com.github.dhslrl321.core

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

class ConcreteTemplateTest: BehaviorSpec({
    given("객체 준비") {

        val sut = ConcreteTemplate()

        `when`("act") {

            val actual = sut.templateMethod()

            then("assert") {
                actual shouldBe Results("hello world")
            }
        }
    }
})