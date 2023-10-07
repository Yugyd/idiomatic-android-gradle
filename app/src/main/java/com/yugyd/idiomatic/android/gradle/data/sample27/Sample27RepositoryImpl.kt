package com.yugyd.idiomatic.android.gradle.data.sample27

import kotlinx.coroutines.flow.flow

class Sample27RepositoryImpl : Sample27Repository {
    override fun getData() = flow {
        emit("Sample27")
    }
}
