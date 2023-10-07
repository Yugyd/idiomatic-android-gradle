package com.yugyd.idiomatic.android.gradle.data.sample19

import kotlinx.coroutines.flow.Flow

interface Sample19Repository {
    fun getData(): Flow<String>
}
