package com.yugyd.idiomatic.android.gradle.ui.sample32

interface Sample32View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}