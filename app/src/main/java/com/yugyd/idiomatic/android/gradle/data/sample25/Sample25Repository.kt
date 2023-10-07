package com.yugyd.idiomatic.android.gradle.data.sample25

import kotlinx.coroutines.flow.Flow

interface Sample25Repository {
    fun getData(): Flow<String>
}
