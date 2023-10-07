package com.yugyd.idiomatic.android.gradle.domain.sample16

import com.yugyd.idiomatic.android.gradle.data.sample16.Sample16Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample16UseCase(
    private val sample16Repository: Sample16Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample16Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
