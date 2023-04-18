package com.github.dhslrl321.core

class Adapter(private val adaptee: Adaptee): ClientInterface {
    override fun operation() {
        adaptee.method()
    }
}