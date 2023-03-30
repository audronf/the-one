package com.audronf.theone.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.audronf.theone.R

val Ringbearer = FontFamily(
    Font(R.font.ringbearer)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Ringbearer,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = Kabul
    ),
    headlineLarge = TextStyle(
        fontFamily = Ringbearer,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
        lineHeight = 48.sp,
        letterSpacing = 1.sp,
        color = Kabul
    ),
    labelLarge = TextStyle(
        fontFamily = Ringbearer,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 1.sp,
        color = Kabul
    )
)
