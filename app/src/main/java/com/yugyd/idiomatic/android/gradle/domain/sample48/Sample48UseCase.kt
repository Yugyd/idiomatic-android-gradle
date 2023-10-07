package com.yugyd.idiomatic.android.gradle.domain.sample48

import com.yugyd.idiomatic.android.gradle.data.sample48.Sample48Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample48UseCase(
    private val sample48Repository: Sample48Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample48Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
