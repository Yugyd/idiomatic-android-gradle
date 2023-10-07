package com.yugyd.idiomatic.android.gradle.ui.sample33

interface Sample33View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}