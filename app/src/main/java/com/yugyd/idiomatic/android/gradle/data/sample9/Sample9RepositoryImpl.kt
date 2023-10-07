package com.yugyd.idiomatic.android.gradle.data.sample9

import kotlinx.coroutines.flow.flow

class Sample9RepositoryImpl : Sample9Repository {
    override fun getData() = flow {
        emit("Sample9")
    }
}
