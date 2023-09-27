package com.yugyd.idiomatic.android.gradle.data.sample5

import kotlinx.coroutines.flow.Flow

interface Sample5Repository {
    fun getData(): Flow<String>
}
