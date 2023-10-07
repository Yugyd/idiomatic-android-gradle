package com.yugyd.idiomatic.android.gradle.ui.sample28

interface Sample28View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}