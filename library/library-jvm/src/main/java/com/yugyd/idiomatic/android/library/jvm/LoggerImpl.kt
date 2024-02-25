package com.yugyd.idiomatic.android.library.jvm

class LoggerImpl : Logger {

    override fun log(msg: String) {
        println(msg)
    }
}
