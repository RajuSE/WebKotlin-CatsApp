package com.webkotlinjs.sample

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import kotlinx.coroutines.CoroutineScope

@Composable
expect fun rememberCatsworldAppState(): CatsworldAppState

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
@Stable
expect class CatsworldAppState {

    val scaffoldState: ScaffoldState
    val coroutineScope: CoroutineScope
    val currentRoute: String?

    fun navigateToRoute(route: String)
    fun upPress()
}

