package com.example.kayjay.presentation.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.kayjay.utils.h
import com.example.kayjay.utils.w

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    content: @Composable () -> Unit = {},
    padding: PaddingValues = PaddingValues(horizontal = 10.dp.w(), vertical = 20.dp.h())
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
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
            ) {
                content()
                BottomBar(navController = navController)
            }
        }
    }
}