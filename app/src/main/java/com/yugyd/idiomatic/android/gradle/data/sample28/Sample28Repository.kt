package com.yugyd.idiomatic.android.gradle.data.sample28

import kotlinx.coroutines.flow.Flow

interface Sample28Repository {
    fun getData(): Flow<String>
}
