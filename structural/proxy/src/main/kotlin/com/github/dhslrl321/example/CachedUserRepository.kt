package com.github.dhslrl321.example

class CachedUserRepository(private val repository: JdbcUserRepository) : UserRepository {

    private val cached = HashMap<Int, User>()

    override fun save(user: User) {
        cached[user.id] = user // 1차 캐시에 저장
        repository.save(user) // 실제 영속성 레이어에 저장
    }

    override fun findBy(id: Int): User {
        return cached[id] ?: repository.findBy(id)
    }
}