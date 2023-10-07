package com.yugyd.idiomatic.android.gradle.data.sample32

import kotlinx.coroutines.flow.Flow

interface Sample32Repository {
    fun getData(): Flow<String>
}
