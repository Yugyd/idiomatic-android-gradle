package com.yugyd.idiomatic.android.gradle.domain.sample52

import com.yugyd.idiomatic.android.gradle.data.sample52.Sample52Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample52UseCase(
    private val sample52Repository: Sample52Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample52Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
