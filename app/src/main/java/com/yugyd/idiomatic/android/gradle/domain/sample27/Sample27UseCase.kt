package com.yugyd.idiomatic.android.gradle.domain.sample27

import com.yugyd.idiomatic.android.gradle.data.sample27.Sample27Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample27UseCase(
    private val sample27Repository: Sample27Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample27Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
