package com.yugyd.idiomatic.android.gradle.data.sample49

import kotlinx.coroutines.flow.Flow

interface Sample49Repository {
    fun getData(): Flow<String>
}
