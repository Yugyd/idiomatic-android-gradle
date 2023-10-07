package com.yugyd.idiomatic.android.gradle.domain.sample25

import com.yugyd.idiomatic.android.gradle.data.sample25.Sample25Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample25UseCase(
    private val sample25Repository: Sample25Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample25Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
