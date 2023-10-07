package com.yugyd.idiomatic.android.gradle.ui.sample9

interface Sample9View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}