package com.yugyd.idiomatic.android.gradle.data.sample55

import kotlinx.coroutines.flow.Flow

interface Sample55Repository {
    fun getData(): Flow<String>
}
