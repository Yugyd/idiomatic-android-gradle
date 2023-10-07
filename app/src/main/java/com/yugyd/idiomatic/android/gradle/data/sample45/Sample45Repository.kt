package com.yugyd.idiomatic.android.gradle.data.sample45

import kotlinx.coroutines.flow.Flow

interface Sample45Repository {
    fun getData(): Flow<String>
}
