package com.yugyd.idiomatic.android.gradle.ui.sample43

interface Sample43View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}