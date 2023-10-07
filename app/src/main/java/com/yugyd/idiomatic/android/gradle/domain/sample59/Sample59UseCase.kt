package com.yugyd.idiomatic.android.gradle.domain.sample59

import com.yugyd.idiomatic.android.gradle.data.sample59.Sample59Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample59UseCase(
    private val sample59Repository: Sample59Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample59Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
