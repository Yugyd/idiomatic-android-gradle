package com.yugyd.idiomatic.android.gradle.data.sample57

import kotlinx.coroutines.flow.Flow

interface Sample57Repository {
    fun getData(): Flow<String>
}
