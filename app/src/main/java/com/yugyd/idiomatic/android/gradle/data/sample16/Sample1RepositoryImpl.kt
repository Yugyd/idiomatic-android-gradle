package com.yugyd.idiomatic.android.gradle.data.sample16

import kotlinx.coroutines.flow.flow

class Sample16RepositoryImpl : Sample16Repository {
    override fun getData() = flow {
        emit("Sample16")
    }
}
