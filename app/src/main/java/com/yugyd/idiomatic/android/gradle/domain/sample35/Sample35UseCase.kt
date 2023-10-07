package com.yugyd.idiomatic.android.gradle.domain.sample35

import com.yugyd.idiomatic.android.gradle.data.sample35.Sample35Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample35UseCase(
    private val sample35Repository: Sample35Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample35Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
