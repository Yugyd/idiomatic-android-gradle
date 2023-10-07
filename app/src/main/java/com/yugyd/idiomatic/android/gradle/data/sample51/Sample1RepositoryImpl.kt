package com.yugyd.idiomatic.android.gradle.data.sample51

import kotlinx.coroutines.flow.flow

class Sample51RepositoryImpl : Sample51Repository {
    override fun getData() = flow {
        emit("Sample51")
    }
}
