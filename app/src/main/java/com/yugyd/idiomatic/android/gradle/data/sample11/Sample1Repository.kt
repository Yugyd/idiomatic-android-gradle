package com.yugyd.idiomatic.android.gradle.data.sample11

import kotlinx.coroutines.flow.Flow

interface Sample11Repository {
    fun getData(): Flow<String>
}
