package com.yugyd.idiomatic.android.gradle.data.sample43

import kotlinx.coroutines.flow.Flow

interface Sample43Repository {
    fun getData(): Flow<String>
}
