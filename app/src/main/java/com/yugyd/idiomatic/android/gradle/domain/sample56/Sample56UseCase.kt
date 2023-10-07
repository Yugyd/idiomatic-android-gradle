package com.yugyd.idiomatic.android.gradle.domain.sample56

import com.yugyd.idiomatic.android.gradle.data.sample56.Sample56Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample56UseCase(
    private val sample56Repository: Sample56Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample56Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
