package com.webkotlinjs.sample.dimensions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalDimensionResources: ProvidableCompositionLocal<DimensionResources> =
    staticCompositionLocalOf {
        CompactDimensionResources()
        ExpandedDimensionResources()
    }

object Resources {
    val dimension: DimensionResources
        @Composable
        @ReadOnlyComposable
        get() = LocalDimensionResources.current
}