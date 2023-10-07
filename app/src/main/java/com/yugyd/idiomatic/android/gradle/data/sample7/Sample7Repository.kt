package com.yugyd.idiomatic.android.gradle.data.sample7

import kotlinx.coroutines.flow.Flow

interface Sample7Repository {
    fun getData(): Flow<String>
}
