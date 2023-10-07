package com.yugyd.idiomatic.android.gradle.data.sample26

import kotlinx.coroutines.flow.Flow

interface Sample26Repository {
    fun getData(): Flow<String>
}
