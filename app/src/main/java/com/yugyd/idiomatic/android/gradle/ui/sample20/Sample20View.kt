package com.yugyd.idiomatic.android.gradle.ui.sample20

interface Sample20View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}