package com.yugyd.idiomatic.android.gradle.data.sample5

import kotlinx.coroutines.flow.flow

class Sample5RepositoryImpl : Sample5Repository {
    override fun getData() = flow {
        emit("Sample5")
    }
}
