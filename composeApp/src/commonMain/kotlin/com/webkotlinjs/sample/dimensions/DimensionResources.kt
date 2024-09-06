package com.webkotlinjs.sample.dimensions

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

interface DimensionResources {
    val dimensionType: DimensionType
    val titleTextSize: TextUnit
    val textSize: TextUnit
    val logoImageSize: Dp
    val iconFlagSize: Dp

    val paddingS: Dp
    val paddingM: Dp
    val paddingL: Dp
    val paddingXL: Dp
}