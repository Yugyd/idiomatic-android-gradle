package com.yugyd.idiomatic.android.gradle.ui.sample31

interface Sample31View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}