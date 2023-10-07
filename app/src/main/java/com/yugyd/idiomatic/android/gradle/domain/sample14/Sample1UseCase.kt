package com.yugyd.idiomatic.android.gradle.domain.sample14

import com.yugyd.idiomatic.android.gradle.data.sample14.Sample14Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample14UseCase(
    private val sample14Repository: Sample14Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample14Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
