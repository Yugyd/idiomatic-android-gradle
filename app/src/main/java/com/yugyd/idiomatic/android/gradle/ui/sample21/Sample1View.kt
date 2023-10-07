package com.yugyd.idiomatic.android.gradle.ui.sample21

interface Sample21View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}