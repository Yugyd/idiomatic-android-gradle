package com.yugyd.idiomatic.android.gradle.domain.sample17

import com.yugyd.idiomatic.android.gradle.data.sample17.Sample17Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample17UseCase(
    private val sample17Repository: Sample17Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample17Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
