package com.yugyd.idiomatic.android.gradle.data.sample3

import kotlinx.coroutines.flow.flow

class Sample3RepositoryImpl : Sample3Repository {
    override fun getData() = flow {
        emit("Sample3")
    }
}
