package com.yugyd.idiomatic.android.gradle.data.sample4

import kotlinx.coroutines.flow.Flow

interface Sample4Repository {
    fun getData(): Flow<String>
}
