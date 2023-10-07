package com.yugyd.idiomatic.android.gradle.ui.sample10

interface Sample10View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}