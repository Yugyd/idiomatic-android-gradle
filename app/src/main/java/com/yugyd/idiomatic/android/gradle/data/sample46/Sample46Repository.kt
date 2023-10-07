package com.yugyd.idiomatic.android.gradle.data.sample46

import kotlinx.coroutines.flow.Flow

interface Sample46Repository {
    fun getData(): Flow<String>
}
