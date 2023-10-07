package com.yugyd.idiomatic.android.gradle.ui.sample19

interface Sample19View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}