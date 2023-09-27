package com.yugyd.idiomatic.android.gradle.domain.sample5

import com.yugyd.idiomatic.android.gradle.data.sample5.Sample5Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample5UseCase(
    private val sample5Repository: Sample5Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample5Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
