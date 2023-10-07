package com.yugyd.idiomatic.android.gradle.domain.sample32

import com.yugyd.idiomatic.android.gradle.data.sample32.Sample32Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample32UseCase(
    private val sample32Repository: Sample32Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample32Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
