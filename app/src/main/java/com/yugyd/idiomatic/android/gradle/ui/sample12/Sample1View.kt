package com.yugyd.idiomatic.android.gradle.ui.sample12

interface Sample12View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}