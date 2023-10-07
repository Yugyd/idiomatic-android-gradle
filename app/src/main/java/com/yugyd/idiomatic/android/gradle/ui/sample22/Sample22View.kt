package com.yugyd.idiomatic.android.gradle.ui.sample22

interface Sample22View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}