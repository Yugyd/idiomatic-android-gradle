package com.yugyd.idiomatic.android.gradle.ui.sample49

interface Sample49View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}