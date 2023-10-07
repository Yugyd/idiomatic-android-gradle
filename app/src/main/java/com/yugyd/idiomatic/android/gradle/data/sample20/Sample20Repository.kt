package com.yugyd.idiomatic.android.gradle.data.sample20

import kotlinx.coroutines.flow.Flow

interface Sample20Repository {
    fun getData(): Flow<String>
}
