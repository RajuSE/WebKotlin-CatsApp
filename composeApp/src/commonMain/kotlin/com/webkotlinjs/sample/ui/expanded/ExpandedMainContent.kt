package com.webkotlinjs.sample.ui.expanded

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun ExpandedMainContent(appState: CatsworldAppState) {
    Scaffold(
        backgroundColor = Color.Transparent,
        scaffoldState = appState.scaffoldState,
    ) { innerPadding ->
        Row(
            Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(4f),
                horizontalAlignment = Alignment.Start
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Content(appState)
                    Spacer(modifier = Modifier.size(dimension.paddingM))
                    LanguageComponent()
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(vertical = dimension.paddingL, horizontal = dimension.paddingM)
                    .weight(1f)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                ChangeDimensionComponent()
            }

        }

    }
}