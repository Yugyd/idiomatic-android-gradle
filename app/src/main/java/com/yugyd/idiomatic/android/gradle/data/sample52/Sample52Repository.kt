package com.yugyd.idiomatic.android.gradle.data.sample52

import kotlinx.coroutines.flow.Flow

interface Sample52Repository {
    fun getData(): Flow<String>
}
