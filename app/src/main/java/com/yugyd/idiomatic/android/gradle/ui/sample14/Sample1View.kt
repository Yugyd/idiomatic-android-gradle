package com.yugyd.idiomatic.android.gradle.ui.sample14

interface Sample14View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}