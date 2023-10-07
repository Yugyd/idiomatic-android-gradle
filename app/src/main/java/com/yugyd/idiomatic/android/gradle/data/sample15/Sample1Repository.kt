package com.yugyd.idiomatic.android.gradle.data.sample15

import kotlinx.coroutines.flow.Flow

interface Sample15Repository {
    fun getData(): Flow<String>
}
