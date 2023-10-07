package com.yugyd.idiomatic.android.gradle.data.sample38

import kotlinx.coroutines.flow.flow

class Sample38RepositoryImpl : Sample38Repository {
    override fun getData() = flow {
        emit("Sample38")
    }
}
