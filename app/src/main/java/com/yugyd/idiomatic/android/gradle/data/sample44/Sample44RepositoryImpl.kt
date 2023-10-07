package com.yugyd.idiomatic.android.gradle.data.sample44

import kotlinx.coroutines.flow.flow

class Sample44RepositoryImpl : Sample44Repository {
    override fun getData() = flow {
        emit("Sample44")
    }
}
