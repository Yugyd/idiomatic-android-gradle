package com.yugyd.idiomatic.android.gradle.data.sample59

import kotlinx.coroutines.flow.flow

class Sample59RepositoryImpl : Sample59Repository {
    override fun getData() = flow {
        emit("Sample59")
    }
}
