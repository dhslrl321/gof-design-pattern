package com.github.dhslrl321

import com.github.dhslrl321.core.ProxyService
import com.github.dhslrl321.core.SimpleService
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

private const val TEXT = "someTest"

class ProxyTest : BehaviorSpec({

    given("proxy 객체의 생성자로 대상 객체를 주입") {

        val sut = ProxyService(SimpleService())

        `when`("sut 에게 행위") {

            val actual = sut.operation(TEXT)

            then("proxy 는 `!!` 를 마지막에 붙여준다") {
                actual.props shouldBe TEXT.plus("!!")
            }
        }
    }
})