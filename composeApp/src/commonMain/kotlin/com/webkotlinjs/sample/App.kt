package com.webkotlinjs.sample

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.webkotlinjs.sample.dimensions.DimensionFactory
import com.webkotlinjs.sample.dimensions.DimensionResources
import com.webkotlinjs.sample.dimensions.DimensionType
import com.webkotlinjs.sample.dimensions.LocalDimensionResources
import com.webkotlinjs.sample.dimensions.Resources.dimension
import com.webkotlinjs.sample.strings.LocalStringResources
import com.webkotlinjs.sample.strings.StringFactory
import com.webkotlinjs.sample.strings.StringResources
import com.webkotlinjs.sample.ui.compact.CompactMainContent
import com.webkotlinjs.sample.ui.expanded.ExpandedMainContent

@Composable
fun App(
    stringResources: StringResources = StringFactory.createStrings(language),
    dimensionResources: DimensionResources = DimensionFactory.createDimensions(density.value)
) {
    CompositionLocalProvider(
        LocalStringResources provides stringResources,
        LocalDimensionResources provides dimensionResources
    ) {
        MaterialTheme {
            val appState = rememberCatsworldAppState()

            if (dimension.dimensionType == DimensionType.COMPACT) {
                CompactMainContent(appState)
            } else {
                ExpandedMainContent(appState)
            }
        }
    }
}