package com.yugyd.idiomatic.android.gradle.ui.sample30

interface Sample30View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}