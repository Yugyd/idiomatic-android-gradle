package com.yugyd.idiomatic.android.gradle.domain.sample53

import com.yugyd.idiomatic.android.gradle.data.sample53.Sample53Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample53UseCase(
    private val sample53Repository: Sample53Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample53Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
