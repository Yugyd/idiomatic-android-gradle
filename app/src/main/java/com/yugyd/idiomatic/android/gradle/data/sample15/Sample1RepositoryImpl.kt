package com.yugyd.idiomatic.android.gradle.data.sample15

import kotlinx.coroutines.flow.flow

class Sample15RepositoryImpl : Sample15Repository {
    override fun getData() = flow {
        emit("Sample15")
    }
}
