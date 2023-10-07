package com.yugyd.idiomatic.android.gradle.data.sample10

import kotlinx.coroutines.flow.Flow

interface Sample10Repository {
    fun getData(): Flow<String>
}
