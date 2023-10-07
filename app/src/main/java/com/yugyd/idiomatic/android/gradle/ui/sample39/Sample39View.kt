package com.yugyd.idiomatic.android.gradle.ui.sample39

interface Sample39View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}