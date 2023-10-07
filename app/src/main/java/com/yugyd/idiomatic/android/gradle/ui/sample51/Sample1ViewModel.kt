package com.yugyd.idiomatic.android.gradle.ui.sample51

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yugyd.idiomatic.android.gradle.domain.sample51.Sample51UseCase
import com.yugyd.idiomatic.android.gradle.ui.sample51.Sample51View.State
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class Sample51ViewModel(
    private val sample51UseCase: Sample51UseCase,
) : ViewModel() {

    private val _state = MutableStateFlow(State(isLoading = true))
    val state: StateFlow<State> = _state

    init {
        initData()
    }

    private fun initData() {
        viewModelScope.launch {
            sample51UseCase()
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