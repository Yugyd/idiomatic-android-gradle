package com.yugyd.idiomatic.android.gradle.data.sample55

import kotlinx.coroutines.flow.flow

class Sample55RepositoryImpl : Sample55Repository {
    override fun getData() = flow {
        emit("Sample55")
    }
}
