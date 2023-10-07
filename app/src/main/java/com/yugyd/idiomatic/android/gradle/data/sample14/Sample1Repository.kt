package com.yugyd.idiomatic.android.gradle.data.sample14

import kotlinx.coroutines.flow.Flow

interface Sample14Repository {
    fun getData(): Flow<String>
}
