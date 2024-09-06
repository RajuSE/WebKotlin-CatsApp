package com.webkotlinjs.sample.ui.compact

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.webkotlinjs.sample.CatsworldAppState
import com.webkotlinjs.sample.dimensions.Resources.dimension
import com.webkotlinjs.sample.ui.Content
import com.webkotlinjs.sample.ui.component.ChangeDimensionComponent
import com.webkotlinjs.sample.ui.component.LanguageComponent
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun CompactMainContent(appState: CatsworldAppState) {
    Scaffold(
        backgroundColor = Color.Transparent,
        scaffoldState = appState.scaffoldState,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Content(appState)
                LanguageComponent()
                Spacer(Modifier.size(dimension.paddingM))
                ChangeDimensionComponent()
            }
        }
    }
}