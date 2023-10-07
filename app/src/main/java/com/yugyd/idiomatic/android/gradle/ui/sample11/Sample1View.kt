package com.yugyd.idiomatic.android.gradle.ui.sample11

interface Sample11View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}