package com.webkotlinjs.sample.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.webkotlinjs.sample.dimensions.Resources.dimension
import com.webkotlinjs.sample.language
import com.webkotlinjs.sample.strings.EN_LANG
import com.webkotlinjs.sample.strings.ES_LANG
import webkotlin.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import webkotlin.composeapp.generated.resources.spainflagg
import webkotlin.composeapp.generated.resources.usflagg


@OptIn(ExperimentalResourceApi::class)
@Composable
fun LanguageComponent() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(dimension.paddingL)
    ) {

        Icon(
            painter = painterResource(Res.drawable.usflagg),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier.size(dimension.iconFlagSize)
                .border(2.dp, Color.DarkGray, RoundedCornerShape(size = dimension.paddingM))
                .clip(RoundedCornerShape(size = dimension.paddingM))
                .background(color = if(language.value== EN_LANG) Color.LightGray else Color.Transparent)
                .padding(all = 5.dp)
                .clickable {
                    language.value = EN_LANG
                }
        )

        Icon(
            painter = painterResource(Res.drawable.spainflagg),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier.size(dimension.iconFlagSize)
                .border(2.dp, Color.DarkGray, RoundedCornerShape(size = dimension.paddingM))
                .clip(RoundedCornerShape(size = dimension.paddingM))
                .background(color = if(language.value== ES_LANG) Color.LightGray else Color.Transparent)
                .padding(all = 5.dp)
                .clickable {
                    language.value = ES_LANG
                }
        )
    }
}