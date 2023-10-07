package com.yugyd.idiomatic.android.gradle.ui.sample55

interface Sample55View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}