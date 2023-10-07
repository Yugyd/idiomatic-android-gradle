package com.yugyd.idiomatic.android.gradle.data.sample43

import kotlinx.coroutines.flow.flow

class Sample43RepositoryImpl : Sample43Repository {
    override fun getData() = flow {
        emit("Sample43")
    }
}
