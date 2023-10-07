package com.yugyd.idiomatic.android.gradle.domain.sample21

import com.yugyd.idiomatic.android.gradle.data.sample21.Sample21Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample21UseCase(
    private val sample21Repository: Sample21Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample21Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
