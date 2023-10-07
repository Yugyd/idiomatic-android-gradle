package com.yugyd.idiomatic.android.gradle.ui.sample18

interface Sample18View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}