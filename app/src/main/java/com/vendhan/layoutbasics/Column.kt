package com.vendhan.layoutbasics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

// Vertical Arrangement
@Composable
fun ColumnWithTopVerticalArrangement() {
    Column(
        verticalArrangement = Arrangement.Top
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun ColumnWithCenterVerticalArrangement() {
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun ColumnWithBottomVerticalArrangement() {
    Column(
        verticalArrangement = Arrangement.Bottom
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun ColumnWithSpaceAroundVerticalArrangement() {
    Column(
        verticalArrangement = Arrangement.SpaceAround
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun ColumnWithSpaceBetweenVerticalArrangement() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun ColumnWithSpaceEvenlyVerticalArrangement() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

// Horizontal Alignment
@Composable
fun ColumnWithStartHorizontalAlignment() {
    Column(
        horizontalAlignment = Alignment.Start
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun ColumnWithCenterHorizontallyHorizontalAlignment() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun ColumnWithEndHorizontalAlignment() {
    Column(
        horizontalAlignment = Alignment.End
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}
