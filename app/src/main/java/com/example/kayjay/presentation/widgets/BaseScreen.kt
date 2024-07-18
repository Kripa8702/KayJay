package com.example.kayjay.presentation.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.kayjay.utils.h
import com.example.kayjay.utils.w
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.haze

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    content: @Composable () -> Unit = {},
    padding: PaddingValues = PaddingValues(horizontal = 10.dp.w(), vertical = 10.dp.h())
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    val hazeState = remember { HazeState() }

    Scaffold {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(it)
                .background(
                    color = MaterialTheme.colorScheme.background
                )
                .clickable(
                    interactionSource = remember {
                        MutableInteractionSource()
                    }, indication = null
                ) {
                    keyboardController?.hide()
                    focusManager.clearFocus()

                },
        ) {
            Box(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .haze(
                            hazeState,
                            backgroundColor = MaterialTheme.colorScheme.background,
                            tint = Color.Black.copy(alpha = .2f),
                            blurRadius = 30.dp,
                        )

                ) {
                    content()
                }
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                ) {
                    BottomBar(
                        navController = navController,
                        hazeState = hazeState
                    )
                }
            }
        }
    }
}