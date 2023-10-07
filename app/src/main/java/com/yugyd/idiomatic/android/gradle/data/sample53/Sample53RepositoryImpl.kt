package com.yugyd.idiomatic.android.gradle.data.sample53

import kotlinx.coroutines.flow.flow

class Sample53RepositoryImpl : Sample53Repository {
    override fun getData() = flow {
        emit("Sample53")
    }
}
