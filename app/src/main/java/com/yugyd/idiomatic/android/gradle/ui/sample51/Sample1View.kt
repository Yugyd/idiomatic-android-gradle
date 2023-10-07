package com.yugyd.idiomatic.android.gradle.ui.sample51

interface Sample51View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}