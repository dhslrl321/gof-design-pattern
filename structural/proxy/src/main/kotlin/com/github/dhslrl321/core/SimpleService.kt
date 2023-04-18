package com.github.dhslrl321.core

class SimpleService: Service {
    override fun operation(text: String): Results {
        return Results(text);
    }
}