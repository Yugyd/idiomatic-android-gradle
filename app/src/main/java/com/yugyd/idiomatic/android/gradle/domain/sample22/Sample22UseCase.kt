package com.yugyd.idiomatic.android.gradle.domain.sample22

import com.yugyd.idiomatic.android.gradle.data.sample22.Sample22Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample22UseCase(
    private val sample22Repository: Sample22Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample22Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
