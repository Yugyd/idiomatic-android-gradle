package com.yugyd.idiomatic.android.gradle.ui.sample58

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yugyd.idiomatic.android.gradle.domain.sample58.Sample58UseCase
import com.yugyd.idiomatic.android.gradle.ui.sample58.Sample58View.State
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class Sample58ViewModel(
    private val sample58UseCase: Sample58UseCase,
) : ViewModel() {

    private val _state = MutableStateFlow(State(isLoading = true))
    val state: StateFlow<State> = _state

    init {
        initData()
    }

    private fun initData() {
        viewModelScope.launch {
            sample58UseCase()
                .catch {
                    processError(it)
                }
                .collect(::processData)
        }
    }

    private fun processError(error: Throwable) {
        error.printStackTrace()

        _state.value = _state.value.copy(
            isLoading = false,
            isError = true,
            title = "",
        )
    }

    private fun processData(title: String) {
        _state.value = _state.value.copy(
            isLoading = false,
            isError = false,
            title = title,
        )
    }
}