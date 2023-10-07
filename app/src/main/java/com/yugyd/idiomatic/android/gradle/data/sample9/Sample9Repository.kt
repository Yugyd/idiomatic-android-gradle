package com.yugyd.idiomatic.android.gradle.data.sample9

import kotlinx.coroutines.flow.Flow

interface Sample9Repository {
    fun getData(): Flow<String>
}
