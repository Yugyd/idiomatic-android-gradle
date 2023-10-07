package com.yugyd.idiomatic.android.gradle.data.sample37

import kotlinx.coroutines.flow.Flow

interface Sample37Repository {
    fun getData(): Flow<String>
}
