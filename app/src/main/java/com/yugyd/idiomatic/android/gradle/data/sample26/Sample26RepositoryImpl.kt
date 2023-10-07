package com.yugyd.idiomatic.android.gradle.data.sample26

import kotlinx.coroutines.flow.flow

class Sample26RepositoryImpl : Sample26Repository {
    override fun getData() = flow {
        emit("Sample26")
    }
}
