package com.yugyd.idiomatic.android.gradle.ui.sample46

interface Sample46View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}