package com.yugyd.idiomatic.android.gradle.ui.sample23

interface Sample23View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}