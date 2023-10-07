package com.yugyd.idiomatic.android.gradle.data.sample33

import kotlinx.coroutines.flow.Flow

interface Sample33Repository {
    fun getData(): Flow<String>
}
