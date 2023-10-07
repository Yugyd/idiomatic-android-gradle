package com.yugyd.idiomatic.android.gradle.data.sample37

import kotlinx.coroutines.flow.flow

class Sample37RepositoryImpl : Sample37Repository {
    override fun getData() = flow {
        emit("Sample37")
    }
}
