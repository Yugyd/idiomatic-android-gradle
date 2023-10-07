package com.yugyd.idiomatic.android.gradle.data.sample27

import kotlinx.coroutines.flow.Flow

interface Sample27Repository {
    fun getData(): Flow<String>
}
