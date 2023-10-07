package com.yugyd.idiomatic.android.gradle.ui.sample47

interface Sample47View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}