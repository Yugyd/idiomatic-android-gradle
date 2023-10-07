package com.yugyd.idiomatic.android.gradle.data.sample21

import kotlinx.coroutines.flow.Flow

interface Sample21Repository {
    fun getData(): Flow<String>
}
