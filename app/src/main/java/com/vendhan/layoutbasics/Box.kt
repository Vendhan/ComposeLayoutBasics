package com.vendhan.layoutbasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BoxLayout() {
    Box(
        modifier = Modifier
            .wrapContentSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.tw_logo),
            contentDescription = "Tweets avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(60.dp))
                .width(120.dp)
                .height(120.dp)
        )
        Box(
            modifier =
            Modifier
                .clip(shape = RoundedCornerShape(24.dp))
                .border(width = 2.dp, color = Color.White, shape = RoundedCornerShape(24.dp))
                .background(color = Color.Green)
                .width(32.dp)
                .height(32.dp)
                .align(Alignment.BottomEnd)
        )
    }
}
