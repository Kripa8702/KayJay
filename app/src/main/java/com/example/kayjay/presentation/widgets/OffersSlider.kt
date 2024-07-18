package com.example.kayjay.presentation.widgets

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.example.kayjay.R
import com.example.kayjay.ui.theme.Grey
import com.example.kayjay.ui.theme.White

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OffersSlider(

) {
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { 3 })
    val sliderList = listOf(
        R.drawable.demo_banner,
        R.drawable.demo_banner,
        R.drawable.demo_banner
    )

    Column {
        HorizontalPager(
            state = pagerState,
            pageSpacing = 10.dp,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) { page ->
            Card(
                colors = CardDefaults.cardColors(Color.Transparent),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(0.dp),
                modifier = Modifier
                    .graphicsLayer {
                        lerp(
                            start = 0.85f,
                            stop = 1f,
                            fraction = 1f - pagerState.currentPageOffsetFraction.coerceIn(0f, 1f)
                        ).also { scale ->
                            scaleX = scale
                            scaleY = scale
                        }
                        alpha = lerp(
                            start = 0.5f,
                            stop = 1f,
                            fraction = 1f - pagerState.currentPageOffsetFraction.coerceIn(0f, 1f)
                        )
                    }
                // .aspectRatio(0.5f)
            ) {
                Image(
                    painter = painterResource(id = sliderList[page]),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp),
                    contentScale = ContentScale.Crop
                )
            }

        }

        // dot indicator
        LazyRow(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            items(pagerState.pageCount) { index ->
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .height(5.dp)
                        .width(5.dp)
                        .clip(RoundedCornerShape(50))
                        .background(
                            color = if (pagerState.currentPage == index) White else Grey
                        )
                )
            }
        }
    }
}
