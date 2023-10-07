package com.yugyd.idiomatic.android.gradle.data.sample60

import kotlinx.coroutines.flow.Flow

interface Sample60Repository {
    fun getData(): Flow<String>
}
