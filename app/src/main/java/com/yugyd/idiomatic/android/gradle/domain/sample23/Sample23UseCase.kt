package com.yugyd.idiomatic.android.gradle.domain.sample23

import com.yugyd.idiomatic.android.gradle.data.sample23.Sample23Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample23UseCase(
    private val sample23Repository: Sample23Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample23Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
