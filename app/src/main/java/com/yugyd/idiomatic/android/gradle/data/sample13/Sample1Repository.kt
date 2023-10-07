package com.yugyd.idiomatic.android.gradle.data.sample13

import kotlinx.coroutines.flow.Flow

interface Sample13Repository {
    fun getData(): Flow<String>
}
