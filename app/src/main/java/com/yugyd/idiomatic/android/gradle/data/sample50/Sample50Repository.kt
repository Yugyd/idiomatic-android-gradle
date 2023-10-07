package com.yugyd.idiomatic.android.gradle.data.sample50

import kotlinx.coroutines.flow.Flow

interface Sample50Repository {
    fun getData(): Flow<String>
}
