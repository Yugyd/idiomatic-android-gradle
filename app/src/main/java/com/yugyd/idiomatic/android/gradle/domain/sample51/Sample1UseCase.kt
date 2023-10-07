package com.yugyd.idiomatic.android.gradle.domain.sample51

import com.yugyd.idiomatic.android.gradle.data.sample51.Sample51Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample51UseCase(
    private val sample51Repository: Sample51Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample51Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
