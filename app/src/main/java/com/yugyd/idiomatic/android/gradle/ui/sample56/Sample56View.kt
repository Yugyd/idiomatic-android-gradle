package com.yugyd.idiomatic.android.gradle.ui.sample56

interface Sample56View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}