package com.yugyd.idiomatic.android.gradle.domain.sample30

import com.yugyd.idiomatic.android.gradle.data.sample30.Sample30Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample30UseCase(
    private val sample30Repository: Sample30Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample30Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
