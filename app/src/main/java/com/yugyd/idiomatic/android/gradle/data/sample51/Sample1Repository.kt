package com.yugyd.idiomatic.android.gradle.data.sample51

import kotlinx.coroutines.flow.Flow

interface Sample51Repository {
    fun getData(): Flow<String>
}
