package com.yugyd.idiomatic.android.gradle.domain.sample4

import com.yugyd.idiomatic.android.gradle.data.sample4.Sample4Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample4UseCase(
    private val sample4Repository: Sample4Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample4Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
