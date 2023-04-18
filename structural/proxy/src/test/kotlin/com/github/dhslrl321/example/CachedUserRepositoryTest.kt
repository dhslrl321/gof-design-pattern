package com.github.dhslrl321.example

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

private const val ID = 1

class CachedUserRepositoryTest : BehaviorSpec({
    given("repository 에 저장") {
        val dataSource = SpyDataSource()
        val repository = JdbcUserRepository(dataSource)

        val sut = CachedUserRepository(repository)
        sut.save(User(ID, "jang"))

        `when`("user 조회") {

            sut.findBy(ID)

            then("proxy 객체에 caching 되어 select 쿼리가 호출되지 않음") {
                dataSource.insertCount shouldBe 1
                dataSource.selectCount shouldBe 0
            }
        }
    }
})

class SpyDataSource: DataSource {

    var insertCount = 0
    var selectCount = 0

    override fun insertCall() {
        insertCount++
    }

    override fun selectCall() {
        selectCount++
    }

}