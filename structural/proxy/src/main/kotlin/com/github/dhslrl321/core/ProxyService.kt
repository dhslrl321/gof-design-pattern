package com.github.dhslrl321.core

class ProxyService(val service: Service): Service {
    override fun operation(text: String): Results {
        return service.operation(text.plus("!!"))
    }
}