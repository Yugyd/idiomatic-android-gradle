package com.yugyd.idiomatic.android.gradle.domain.sample6

import com.yugyd.idiomatic.android.gradle.data.sample6.Sample6Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample6UseCase(
    private val sample6Repository: Sample6Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample6Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
