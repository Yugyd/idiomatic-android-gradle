package com.yugyd.idiomatic.android.gradle.data.sample44

import kotlinx.coroutines.flow.Flow

interface Sample44Repository {
    fun getData(): Flow<String>
}
