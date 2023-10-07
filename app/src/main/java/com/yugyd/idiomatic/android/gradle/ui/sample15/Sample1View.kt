package com.yugyd.idiomatic.android.gradle.ui.sample15

interface Sample15View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}