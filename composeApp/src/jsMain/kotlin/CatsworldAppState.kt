package com.webkotlinjs.sample

import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import com.webkotlinjs.sample.navigation.NavigationStack
import com.webkotlinjs.sample.ui.Destinations
import kotlinx.coroutines.CoroutineScope

@Stable
@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class CatsworldAppState(
    actual val scaffoldState: ScaffoldState,
    actual val coroutineScope: CoroutineScope,
) {

    private val navigationStack = NavigationStack(Destinations.START.route)

    actual val currentRoute: String?
        get() = navigationStack.lastWithIndex().value

   actual fun navigateToRoute(route: String) {
        navigationStack.replaceBy(route)
    }

    actual fun upPress() {
        navigationStack.back()
    }
}

@Composable
actual fun rememberCatsworldAppState(): CatsworldAppState {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    return remember(scaffoldState, coroutineScope) {
        CatsworldAppState(scaffoldState, coroutineScope)
    }
}