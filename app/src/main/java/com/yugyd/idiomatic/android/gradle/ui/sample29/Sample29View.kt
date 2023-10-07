package com.yugyd.idiomatic.android.gradle.ui.sample29

interface Sample29View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}