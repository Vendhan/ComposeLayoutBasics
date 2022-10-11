package com.vendhan.layoutbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.vendhan.layoutbasics.ui.theme.LayoutBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    color = MaterialTheme.colors.background
                ) {
                    NewsCard()
                }
            }
        }
    }
}

@Composable
fun NewsCard() {
    Column {
        Text(
            text = "Great News!!!",
            fontSize = MaterialTheme.typography.h6.fontSize
        )
        Text(
            text = "3 minutes ago",
            fontWeight = FontWeight.Light,
            fontSize = MaterialTheme.typography.body1.fontSize
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LayoutBasicsTheme {
        NewsCard()
    }
}
