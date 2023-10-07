package com.yugyd.idiomatic.android.gradle.domain.sample18

import com.yugyd.idiomatic.android.gradle.data.sample18.Sample18Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample18UseCase(
    private val sample18Repository: Sample18Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample18Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
