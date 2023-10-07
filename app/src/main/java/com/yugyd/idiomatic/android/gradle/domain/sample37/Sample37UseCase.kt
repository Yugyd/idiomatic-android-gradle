package com.yugyd.idiomatic.android.gradle.domain.sample37

import com.yugyd.idiomatic.android.gradle.data.sample37.Sample37Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn

class Sample37UseCase(
    private val sample37Repository: Sample37Repository,
) {

    operator fun invoke(): Flow<String> {
        return sample37Repository
            .getData()
            .flowOn(Dispatchers.IO)
    }
}
