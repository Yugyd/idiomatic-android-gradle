package com.yugyd.idiomatic.android.gradle.data.sample30

import kotlinx.coroutines.flow.Flow

interface Sample30Repository {
    fun getData(): Flow<String>
}
