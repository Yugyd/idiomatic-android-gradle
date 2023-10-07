package com.yugyd.idiomatic.android.gradle.data.sample41

import kotlinx.coroutines.flow.flow

class Sample41RepositoryImpl : Sample41Repository {
    override fun getData() = flow {
        emit("Sample41")
    }
}
