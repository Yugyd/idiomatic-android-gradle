package com.yugyd.idiomatic.android.gradle.ui.sample16

interface Sample16View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}