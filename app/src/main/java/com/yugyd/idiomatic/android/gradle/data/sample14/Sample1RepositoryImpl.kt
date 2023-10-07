package com.yugyd.idiomatic.android.gradle.data.sample14

import kotlinx.coroutines.flow.flow

class Sample14RepositoryImpl : Sample14Repository {
    override fun getData() = flow {
        emit("Sample14")
    }
}
