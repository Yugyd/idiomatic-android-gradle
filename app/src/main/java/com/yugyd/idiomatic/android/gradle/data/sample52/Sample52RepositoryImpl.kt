package com.yugyd.idiomatic.android.gradle.data.sample52

import kotlinx.coroutines.flow.flow

class Sample52RepositoryImpl : Sample52Repository {
    override fun getData() = flow {
        emit("Sample52")
    }
}
