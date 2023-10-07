package com.yugyd.idiomatic.android.gradle.ui.sample8

interface Sample8View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}