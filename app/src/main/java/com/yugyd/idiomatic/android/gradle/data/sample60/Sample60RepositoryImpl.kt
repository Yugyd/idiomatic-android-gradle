package com.yugyd.idiomatic.android.gradle.data.sample60

import kotlinx.coroutines.flow.flow

class Sample60RepositoryImpl : Sample60Repository {
    override fun getData() = flow {
        emit("Sample60")
    }
}
