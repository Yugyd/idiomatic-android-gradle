package com.yugyd.idiomatic.android.gradle.data.sample58

import kotlinx.coroutines.flow.Flow

interface Sample58Repository {
    fun getData(): Flow<String>
}
