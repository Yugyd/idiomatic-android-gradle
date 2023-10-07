package com.yugyd.idiomatic.android.gradle.domain.sample42

import com.yugyd.idiomatic.android.gradle.data.sample42.Sample42Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample42UseCase(
    private val sample42Repository: Sample42Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample42Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
