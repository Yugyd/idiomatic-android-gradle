package com.yugyd.idiomatic.android.gradle.ui.sample57

interface Sample57View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}