package com.yugyd.idiomatic.android.gradle.ui.sample42

interface Sample42View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}