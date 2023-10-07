package com.yugyd.idiomatic.android.gradle.ui.sample58

interface Sample58View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}