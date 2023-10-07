package com.yugyd.idiomatic.android.gradle.data.sample23

import kotlinx.coroutines.flow.Flow

interface Sample23Repository {
    fun getData(): Flow<String>
}
