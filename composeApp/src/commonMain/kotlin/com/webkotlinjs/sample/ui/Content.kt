package com.webkotlinjs.sample.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.webkotlinjs.sample.CatsworldAppState
import com.webkotlinjs.sample.dimensions.Resources.dimension
import com.webkotlinjs.sample.strings.Resources.strings
import org.jetbrains.compose.resources.painterResource
import webkotlin.composeapp.generated.resources.Res
import webkotlin.composeapp.generated.resources.british_cat


@Composable
fun Content(appState: CatsworldAppState) {

    Column(
        modifier =
        Modifier
            .fillMaxWidth()
            .padding(dimension.paddingL),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            alignment = Alignment.TopCenter,
            painter = painterResource(Res.drawable.british_cat),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(dimension.logoImageSize)
                .border(2.dp, Color.DarkGray, RoundedCornerShape(size = dimension.paddingM))
                .clip(RoundedCornerShape(size = dimension.paddingM))
        )
        Spacer(modifier = Modifier.size(dimension.paddingS))
        Text(
            text = strings.name,
            fontSize = dimension.titleTextSize
        )
        Spacer(modifier = Modifier.size(dimension.paddingS))
        Text(
            text = strings.description,
            fontSize = dimension.textSize
        )
    }
}