package com.yugyd.idiomatic.android.gradle.data.sample10

import kotlinx.coroutines.flow.flow

class Sample10RepositoryImpl : Sample10Repository {
    override fun getData() = flow {
        emit("Sample10")
    }
}
