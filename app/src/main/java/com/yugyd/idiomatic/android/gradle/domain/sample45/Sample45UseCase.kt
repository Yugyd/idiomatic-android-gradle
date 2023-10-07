package com.yugyd.idiomatic.android.gradle.domain.sample45

import com.yugyd.idiomatic.android.gradle.data.sample45.Sample45Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample45UseCase(
    private val sample45Repository: Sample45Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample45Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
