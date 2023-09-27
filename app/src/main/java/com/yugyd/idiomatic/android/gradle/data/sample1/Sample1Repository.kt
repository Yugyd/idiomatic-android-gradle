package com.yugyd.idiomatic.android.gradle.data.sample1

import kotlinx.coroutines.flow.Flow

interface Sample1Repository {
    fun getData(): Flow<String>
}
