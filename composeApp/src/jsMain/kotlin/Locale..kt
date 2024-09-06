package com.webkotlinjs.sample

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.intl.Locale
import com.webkotlinjs.sample.strings.EN_LANG
import com.webkotlinjs.sample.strings.ES_LANG

actual var language: MutableState<String> = mutableStateOf(
    if (Locale.current.language == ES_LANG) {
        ES_LANG
    } else {
        EN_LANG
    }
)
