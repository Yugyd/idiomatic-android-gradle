package com.yugyd.idiomatic.android.gradle.data.sample24

import kotlinx.coroutines.flow.flow

class Sample24RepositoryImpl : Sample24Repository {
    override fun getData() = flow {
        emit("Sample24")
    }
}
