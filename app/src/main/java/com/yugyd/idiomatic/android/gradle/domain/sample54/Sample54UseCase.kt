package com.yugyd.idiomatic.android.gradle.domain.sample54

import com.yugyd.idiomatic.android.gradle.data.sample54.Sample54Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample54UseCase(
    private val sample54Repository: Sample54Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample54Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
