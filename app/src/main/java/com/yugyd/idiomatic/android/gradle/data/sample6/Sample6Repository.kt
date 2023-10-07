package com.yugyd.idiomatic.android.gradle.data.sample6

import kotlinx.coroutines.flow.Flow

interface Sample6Repository {
    fun getData(): Flow<String>
}
