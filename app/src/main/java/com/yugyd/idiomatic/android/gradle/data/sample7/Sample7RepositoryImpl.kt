package com.yugyd.idiomatic.android.gradle.data.sample7

import kotlinx.coroutines.flow.flow

class Sample7RepositoryImpl : Sample7Repository {
    override fun getData() = flow {
        emit("Sample7")
    }
}
