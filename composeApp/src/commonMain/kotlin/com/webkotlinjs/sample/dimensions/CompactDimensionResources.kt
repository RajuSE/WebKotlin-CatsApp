package com.webkotlinjs.sample.dimensions

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CompactDimensionResources : DimensionResources {
    override val dimensionType: DimensionType
        get() = DimensionType.COMPACT
    override val textSize: TextUnit
        get() = 25.sp

    override val titleTextSize: TextUnit
        get() = 36.sp
    override val logoImageSize: Dp
        get() = 250.dp
    override val iconFlagSize: Dp
        get() = 65.dp

    override val paddingS: Dp
        get() = 12.dp
    override val paddingM: Dp
        get() = 18.dp
    override val paddingL: Dp
        get() = 36.dp
    override val paddingXL: Dp
        get() = 72.dp
}