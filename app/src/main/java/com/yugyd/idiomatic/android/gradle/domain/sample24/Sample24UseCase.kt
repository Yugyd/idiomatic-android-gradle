package com.yugyd.idiomatic.android.gradle.domain.sample24

import com.yugyd.idiomatic.android.gradle.data.sample24.Sample24Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample24UseCase(
    private val sample24Repository: Sample24Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample24Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
