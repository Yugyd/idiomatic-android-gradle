package com.yugyd.idiomatic.android.gradle.data.sample31

import kotlinx.coroutines.flow.flow

class Sample31RepositoryImpl : Sample31Repository {
    override fun getData() = flow {
        emit("Sample31")
    }
}
