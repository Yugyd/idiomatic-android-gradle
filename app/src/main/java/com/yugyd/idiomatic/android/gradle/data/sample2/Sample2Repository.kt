package com.yugyd.idiomatic.android.gradle.data.sample2

import kotlinx.coroutines.flow.Flow

interface Sample2Repository {
    fun getData(): Flow<String>
}
