package com.yugyd.idiomatic.android.gradle.data.sample53

import kotlinx.coroutines.flow.Flow

interface Sample53Repository {
    fun getData(): Flow<String>
}
