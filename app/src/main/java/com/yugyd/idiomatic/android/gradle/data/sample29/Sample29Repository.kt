package com.yugyd.idiomatic.android.gradle.data.sample29

import kotlinx.coroutines.flow.Flow

interface Sample29Repository {
    fun getData(): Flow<String>
}
