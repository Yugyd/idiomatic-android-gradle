package com.yugyd.idiomatic.android.gradle.domain.sample46

import com.yugyd.idiomatic.android.gradle.data.sample46.Sample46Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample46UseCase(
    private val sample46Repository: Sample46Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample46Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
