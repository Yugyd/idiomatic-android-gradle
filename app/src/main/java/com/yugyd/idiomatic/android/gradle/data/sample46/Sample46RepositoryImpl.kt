package com.yugyd.idiomatic.android.gradle.data.sample46

import kotlinx.coroutines.flow.flow

class Sample46RepositoryImpl : Sample46Repository {
    override fun getData() = flow {
        emit("Sample46")
    }
}
