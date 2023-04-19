package com.github.dhslrl321

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class MainKtTest : FunSpec({
    test("hello test") {
        1 + 2 shouldBe 3
    }
})