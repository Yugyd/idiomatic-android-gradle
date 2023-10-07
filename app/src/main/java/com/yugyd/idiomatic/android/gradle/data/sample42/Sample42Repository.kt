package com.yugyd.idiomatic.android.gradle.data.sample42

import kotlinx.coroutines.flow.Flow

interface Sample42Repository {
    fun getData(): Flow<String>
}
