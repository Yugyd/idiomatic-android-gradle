package com.yugyd.idiomatic.android.gradle.ui.sample7

interface Sample7View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}