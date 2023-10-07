package com.yugyd.idiomatic.android.gradle.ui.sample35

interface Sample35View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}