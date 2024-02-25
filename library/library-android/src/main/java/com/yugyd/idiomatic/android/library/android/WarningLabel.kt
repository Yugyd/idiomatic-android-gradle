package com.yugyd.idiomatic.android.library.android

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun WarningLabel() {
    Text(
        text = stringResource(id = R.string.library_android_warning_title),
        modifier = Modifier.fillMaxWidth(),
    )
}
