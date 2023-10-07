package com.yugyd.idiomatic.android.gradle.data.sample57

import kotlinx.coroutines.flow.flow

class Sample57RepositoryImpl : Sample57Repository {
    override fun getData() = flow {
        emit("Sample57")
    }
}
