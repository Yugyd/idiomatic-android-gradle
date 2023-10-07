package com.yugyd.idiomatic.android.gradle.ui.sample12

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yugyd.idiomatic.android.gradle.domain.sample12.Sample12UseCase
import com.yugyd.idiomatic.android.gradle.ui.sample12.Sample12View.State
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class Sample12ViewModel(
    private val sample12UseCase: Sample12UseCase,
) : ViewModel() {

    private val _state = MutableStateFlow(State(isLoading = true))
    val state: StateFlow<State> = _state

    init {
        initData()
    }

    private fun initData() {
        viewModelScope.launch {
            sample12UseCase()
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