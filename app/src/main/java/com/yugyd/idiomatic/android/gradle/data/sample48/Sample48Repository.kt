package com.yugyd.idiomatic.android.gradle.data.sample48

import kotlinx.coroutines.flow.Flow

interface Sample48Repository {
    fun getData(): Flow<String>
}
