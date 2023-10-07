package com.yugyd.idiomatic.android.gradle.domain.sample43

import com.yugyd.idiomatic.android.gradle.data.sample43.Sample43Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample43UseCase(
    private val sample43Repository: Sample43Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample43Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
