package com.yugyd.idiomatic.android.gradle.domain.sample11

import com.yugyd.idiomatic.android.gradle.data.sample11.Sample11Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample11UseCase(
    private val sample11Repository: Sample11Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample11Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
