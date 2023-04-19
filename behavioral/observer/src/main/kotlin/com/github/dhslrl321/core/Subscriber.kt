package com.github.dhslrl321.core

interface Subscriber {
    fun doNotify(command: Command)
}