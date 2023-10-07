package com.yugyd.idiomatic.android.gradle.data.sample42

import kotlinx.coroutines.flow.flow

class Sample42RepositoryImpl : Sample42Repository {
    override fun getData() = flow {
        emit("Sample42")
    }
}
