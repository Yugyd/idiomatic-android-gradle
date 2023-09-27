package com.yugyd.idiomatic.android.gradle.data.sample3

import kotlinx.coroutines.flow.Flow

interface Sample3Repository {
    fun getData(): Flow<String>
}
