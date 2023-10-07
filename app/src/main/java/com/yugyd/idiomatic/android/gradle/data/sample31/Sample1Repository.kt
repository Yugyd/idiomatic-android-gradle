package com.yugyd.idiomatic.android.gradle.data.sample31

import kotlinx.coroutines.flow.Flow

interface Sample31Repository {
    fun getData(): Flow<String>
}
