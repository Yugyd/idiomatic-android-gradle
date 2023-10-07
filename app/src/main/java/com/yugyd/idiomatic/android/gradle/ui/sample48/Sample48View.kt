package com.yugyd.idiomatic.android.gradle.ui.sample48

interface Sample48View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}