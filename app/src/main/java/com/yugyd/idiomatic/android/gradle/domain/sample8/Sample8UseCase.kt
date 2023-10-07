package com.yugyd.idiomatic.android.gradle.domain.sample8

import com.yugyd.idiomatic.android.gradle.data.sample8.Sample8Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample8UseCase(
    private val sample8Repository: Sample8Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample8Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
