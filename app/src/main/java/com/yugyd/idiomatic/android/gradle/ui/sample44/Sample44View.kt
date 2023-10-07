package com.yugyd.idiomatic.android.gradle.ui.sample44

interface Sample44View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}