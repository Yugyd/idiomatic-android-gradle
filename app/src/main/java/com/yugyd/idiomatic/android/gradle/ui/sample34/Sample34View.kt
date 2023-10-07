package com.yugyd.idiomatic.android.gradle.ui.sample34

interface Sample34View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}