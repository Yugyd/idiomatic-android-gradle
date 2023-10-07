package com.yugyd.idiomatic.android.gradle.data.sample36

import kotlinx.coroutines.flow.flow

class Sample36RepositoryImpl : Sample36Repository {
    override fun getData() = flow {
        emit("Sample36")
    }
}
