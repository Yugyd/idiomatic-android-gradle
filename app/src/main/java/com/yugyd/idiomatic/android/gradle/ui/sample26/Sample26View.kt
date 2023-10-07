package com.yugyd.idiomatic.android.gradle.ui.sample26

interface Sample26View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}