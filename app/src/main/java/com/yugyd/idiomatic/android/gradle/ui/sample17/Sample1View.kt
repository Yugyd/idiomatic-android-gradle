package com.yugyd.idiomatic.android.gradle.ui.sample17

interface Sample17View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}