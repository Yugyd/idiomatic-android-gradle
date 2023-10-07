package com.yugyd.idiomatic.android.gradle.domain.sample49

import com.yugyd.idiomatic.android.gradle.data.sample49.Sample49Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample49UseCase(
    private val sample49Repository: Sample49Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample49Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
