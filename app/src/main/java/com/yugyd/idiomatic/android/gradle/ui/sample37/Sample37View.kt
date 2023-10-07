package com.yugyd.idiomatic.android.gradle.ui.sample37

interface Sample37View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}