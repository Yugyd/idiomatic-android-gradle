package com.yugyd.idiomatic.android.gradle.domain.sample33

import com.yugyd.idiomatic.android.gradle.data.sample33.Sample33Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample33UseCase(
    private val sample33Repository: Sample33Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample33Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
