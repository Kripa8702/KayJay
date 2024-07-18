package com.example.kayjay.presentation.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.kayjay.R
import com.example.kayjay.presentation.widgets.BaseScreen
import com.example.kayjay.presentation.widgets.OffersSlider
import com.example.kayjay.ui.theme.KayJayTheme
import com.example.kayjay.utils.h
import dev.chrisbanes.haze.haze

@Composable
fun HomeScreen(
    navController: NavController,
) {
    BaseScreen(
        navController = navController,
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Browse Collections",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Image(
                        painter = painterResource(id = R.drawable.heart_unfilled),
                        contentDescription = "Favorite",
                        modifier = Modifier.height(5.dp.h())
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(vertical = 5.dp.h())
                ) {
                    OffersSlider()
                }
                Spacer(modifier = Modifier.weight(1f))
//                Box(
//                    modifier = Modifier
//                        .height(100.dp)
//                        .background(Color.Red)
//                        .fillMaxSize()
//
//                ) {
//                    Row(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(10.dp),
//                        horizontalArrangement = Arrangement.SpaceEvenly
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .background(Color.Yellow)
//                                .width(100.dp)
//                                .height(100.dp)
//                        )
//                        Box(
//                            modifier = Modifier
//                                .background(Color.Green)
//                                .width(100.dp)
//                                .height(100.dp)
//                        )
//                        Box(
//                            modifier = Modifier
//                                .background(Color.Blue)
//                                .width(100.dp)
//                                .height(100.dp)
//                        )
//                    }
//                }
            }
        }
    )
}

@Preview
@Composable
fun HomeScreenPreview() {
    KayJayTheme {
        HomeScreen(
            navController = NavController(LocalContext.current)
        )
    }
}