package com.yugyd.idiomatic.android.gradle.data.sample16

import kotlinx.coroutines.flow.Flow

interface Sample16Repository {
    fun getData(): Flow<String>
}
