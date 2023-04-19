package com.github.dhslrl321.core

abstract class AbstractTemplate {
    protected abstract fun hook1(): String

    protected abstract fun hook2(): String

    fun templateMethod(): Results = Results(hook1().plus(hook2()))
}