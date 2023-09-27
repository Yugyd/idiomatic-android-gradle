package com.yugyd.idiomatic.android.gradle.data.sample2

import kotlinx.coroutines.flow.flow

class Sample2RepositoryImpl : Sample2Repository {
    override fun getData() = flow {
        emit("Sample2")
    }
}
