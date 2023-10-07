package com.yugyd.idiomatic.android.gradle.data.sample34

import kotlinx.coroutines.flow.Flow

interface Sample34Repository {
    fun getData(): Flow<String>
}
