package com.yugyd.idiomatic.android.gradle.ui.sample5

interface Sample5View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}