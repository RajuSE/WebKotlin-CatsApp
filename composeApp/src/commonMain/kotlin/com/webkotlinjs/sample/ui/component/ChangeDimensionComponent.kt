package com.webkotlinjs.sample.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.webkotlinjs.sample.density
import com.webkotlinjs.sample.dimensions.DimensionType
import com.webkotlinjs.sample.dimensions.Resources.dimension
import com.webkotlinjs.sample.language
import com.webkotlinjs.sample.strings.EN_LANG
import com.webkotlinjs.sample.strings.Resources.strings
import org.jetbrains.compose.resources.painterResource
import webkotlin.composeapp.generated.resources.Res
import webkotlin.composeapp.generated.resources.usflagg

@Composable
fun ChangeDimensionComponent() {
    if (dimension.dimensionType == DimensionType.COMPACT) {
        CompactChangeDimensionComponent()
    } else {
        ExpandedChangeDimensionComponent()
    }
}

@Composable
private fun CompactChangeDimensionComponent() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(dimension.paddingM)
    ) {
        ChangeDimensionButtons()
    }
}

@Composable
private fun ExpandedChangeDimensionComponent() {
    Column (
        verticalArrangement = Arrangement.spacedBy(dimension.paddingM)
    ) {
        ChangeDimensionButtons()
    }
}

@Composable
private fun ChangeDimensionButtons() {


    Box(
        modifier = Modifier
            .border(2.dp, Color.DarkGray, RoundedCornerShape(size = dimension.paddingM))
            .clip(RoundedCornerShape(size = dimension.paddingM))
            .background(color = if(density.value== Density(density=2.5f)) Color.Blue else Color.LightGray)
            .padding(all = 12.dp)
            .clickable {
                density.value = Density(density = 1f)
            },
    ) {
        Text(
            text = "Size 1",
            fontSize = dimension.textSize
        )
    }

    Box(
        modifier = Modifier
            .border(2.dp, Color.DarkGray, RoundedCornerShape(size = dimension.paddingM))
            .clip(RoundedCornerShape(size = dimension.paddingM))
            .background(color = if(density.value== Density(density=1f)) Color.Blue else Color.LightGray)
            .padding(all = 12.dp)
            .clickable {
                density.value = Density(density = 2.5f)
            },
    ) {
        Text(
            text = "Size 2",
            fontSize = dimension.textSize
        )
    }

    /*Button(
        onClick = {
            density.value = Density(density = 1f)
        }
    ) {
        Text(
            text = "Size 2",
            fontSize = dimension.textSize
        )
    }*/
}