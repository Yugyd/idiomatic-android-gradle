package com.yugyd.idiomatic.android.gradle.data.sample58

import kotlinx.coroutines.flow.flow

class Sample58RepositoryImpl : Sample58Repository {
    override fun getData() = flow {
        emit("Sample58")
    }
}
