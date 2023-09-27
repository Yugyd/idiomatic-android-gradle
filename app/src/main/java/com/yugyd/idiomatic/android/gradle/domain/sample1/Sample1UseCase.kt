package com.yugyd.idiomatic.android.gradle.domain.sample1

import com.yugyd.idiomatic.android.gradle.data.sample1.Sample1Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample1UseCase(
    private val sample1Repository: Sample1Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample1Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
