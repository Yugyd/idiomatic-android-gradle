package com.yugyd.idiomatic.android.gradle.data.sample21

import kotlinx.coroutines.flow.flow

class Sample21RepositoryImpl : Sample21Repository {
    override fun getData() = flow {
        emit("Sample21")
    }
}
