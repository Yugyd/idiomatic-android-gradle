package com.yugyd.idiomatic.android.gradle.domain.sample12

import com.yugyd.idiomatic.android.gradle.data.sample12.Sample12Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample12UseCase(
    private val sample12Repository: Sample12Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample12Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
