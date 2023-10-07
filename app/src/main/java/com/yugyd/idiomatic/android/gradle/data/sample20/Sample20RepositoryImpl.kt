package com.yugyd.idiomatic.android.gradle.data.sample20

import kotlinx.coroutines.flow.flow

class Sample20RepositoryImpl : Sample20Repository {
    override fun getData() = flow {
        emit("Sample20")
    }
}
