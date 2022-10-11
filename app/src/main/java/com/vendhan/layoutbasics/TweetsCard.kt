package com.vendhan.layoutbasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vendhan.layoutbasics.ui.theme.LayoutBasicsTheme

@Composable
fun TweetsCard(
    profileName: String,
    profileImage: Int,
    content: String,
    postImage: Int
) {
    Row(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = profileImage),
            contentDescription = "Tweets avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(24.dp))
                .width(48.dp)
                .height(48.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = profileName,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = content
            )
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painter = painterResource(id = postImage),
                contentDescription = "Post Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(8.dp))
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_mode_comment_24),
                    contentDescription = "Comment"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_bookmark_border_24),
                    contentDescription = "Bookmark"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_favorite_border_24),
                    contentDescription = "Like"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_share_24),
                    contentDescription = "Share"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TweetsCardPreview() {
    LayoutBasicsTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            TweetsCard(
                profileName = "Thoughtworks",
                profileImage = R.drawable.tw_logo,
                content = "Thoughtworks UK has been named on the UK's Best Workplace in Tech list 2022! We are proud to be ranked at 10th in the large category demonstrating our commitment to creating a culture of inclusion, belonging and text excellence.",
                postImage = R.drawable.tw_post
            )
        }
    }
}
