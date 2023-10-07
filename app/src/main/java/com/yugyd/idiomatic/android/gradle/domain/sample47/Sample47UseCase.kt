package com.yugyd.idiomatic.android.gradle.domain.sample47

import com.yugyd.idiomatic.android.gradle.data.sample47.Sample47Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample47UseCase(
    private val sample47Repository: Sample47Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample47Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
