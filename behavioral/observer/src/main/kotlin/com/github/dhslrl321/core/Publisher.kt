package com.github.dhslrl321.core

class Publisher {
    private val subscribers = ArrayList<Subscriber>()

    fun notifyAll() {
        subscribers.forEach { it.doNotify(Command()) }
    }
}
