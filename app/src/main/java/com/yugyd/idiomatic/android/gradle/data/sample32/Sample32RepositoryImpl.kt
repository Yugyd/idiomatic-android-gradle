package com.yugyd.idiomatic.android.gradle.data.sample32

import kotlinx.coroutines.flow.flow

class Sample32RepositoryImpl : Sample32Repository {
    override fun getData() = flow {
        emit("Sample32")
    }
}
