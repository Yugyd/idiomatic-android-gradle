package com.yugyd.idiomatic.android.gradle.domain.sample19

import com.yugyd.idiomatic.android.gradle.data.sample19.Sample19Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample19UseCase(
    private val sample19Repository: Sample19Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample19Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
