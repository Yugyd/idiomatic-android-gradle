package com.yugyd.idiomatic.android.gradle.domain.sample31

import com.yugyd.idiomatic.android.gradle.data.sample31.Sample31Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample31UseCase(
    private val sample31Repository: Sample31Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample31Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
