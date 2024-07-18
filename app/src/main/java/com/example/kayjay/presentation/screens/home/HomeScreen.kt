package com.example.kayjay.presentation.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kayjay.R
import com.example.kayjay.presentation.widgets.BaseScreen
import com.example.kayjay.ui.theme.KayJayTheme
import com.example.kayjay.utils.h

@Composable
fun HomeScreen() {
    BaseScreen(
        content = {
            Column {
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
                        modifier = Modifier.height(10.dp.h())
                    )
                }
            }
        }
    )
}

@Preview
@Composable
fun HomeScreenPreview() {
    KayJayTheme {
        HomeScreen()
    }
}