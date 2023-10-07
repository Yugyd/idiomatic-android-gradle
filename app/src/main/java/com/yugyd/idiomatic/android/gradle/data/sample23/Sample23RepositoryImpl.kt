package com.yugyd.idiomatic.android.gradle.data.sample23

import kotlinx.coroutines.flow.flow

class Sample23RepositoryImpl : Sample23Repository {
    override fun getData() = flow {
        emit("Sample23")
    }
}
