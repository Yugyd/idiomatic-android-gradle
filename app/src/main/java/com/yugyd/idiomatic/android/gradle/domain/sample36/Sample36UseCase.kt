package com.yugyd.idiomatic.android.gradle.domain.sample36

import com.yugyd.idiomatic.android.gradle.data.sample36.Sample36Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample36UseCase(
    private val sample36Repository: Sample36Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample36Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
