package com.vendhan.layoutbasics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

// Horizontal Arrangement
@Composable
fun RowWithStartHorizontalArrangement() {
    Row(
        horizontalArrangement = Arrangement.Start
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun RowWithCenterHorizontalArrangement() {
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun RowWithEndHorizontalArrangement() {
    Row(
        horizontalArrangement = Arrangement.End
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun RowWithSpaceAroundHorizontalArrangement() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun RowWithSpaceBetweenHorizontalArrangement() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun RowWithSpaceEvenlyHorizontalArrangement() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

// Vertical Alignment
@Composable
fun RowWithTopVerticalAlignment() {
    Row(
        verticalAlignment = Alignment.Top
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun RowWithCenterVerticallyVerticalAlignment() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun RowWithBottomVerticalAlignment() {
    Row(
        verticalAlignment = Alignment.Bottom
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}
