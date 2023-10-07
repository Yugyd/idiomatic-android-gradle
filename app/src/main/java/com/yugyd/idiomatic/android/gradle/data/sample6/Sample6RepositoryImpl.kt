package com.yugyd.idiomatic.android.gradle.data.sample6

import kotlinx.coroutines.flow.flow

class Sample6RepositoryImpl : Sample6Repository {
    override fun getData() = flow {
        emit("Sample6")
    }
}
