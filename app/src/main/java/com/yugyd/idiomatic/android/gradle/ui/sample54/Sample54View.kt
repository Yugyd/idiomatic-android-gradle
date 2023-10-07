package com.yugyd.idiomatic.android.gradle.ui.sample54

interface Sample54View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}