package com.yugyd.idiomatic.android.gradle.domain.sample13

import com.yugyd.idiomatic.android.gradle.data.sample13.Sample13Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample13UseCase(
    private val sample13Repository: Sample13Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample13Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
