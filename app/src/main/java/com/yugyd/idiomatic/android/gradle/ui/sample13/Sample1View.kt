package com.yugyd.idiomatic.android.gradle.ui.sample13

interface Sample13View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}