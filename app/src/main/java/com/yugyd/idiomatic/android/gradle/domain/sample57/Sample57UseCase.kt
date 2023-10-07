package com.yugyd.idiomatic.android.gradle.domain.sample57

import com.yugyd.idiomatic.android.gradle.data.sample57.Sample57Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample57UseCase(
    private val sample57Repository: Sample57Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample57Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
