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
        fontSize = TextSize16sp,
        lineHeight = TextSize24sp,
        letterSpacing = 0.5.sp,
        color = Kabul
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize12sp,
        lineHeight = TextSize16sp,
        letterSpacing = 0.5.sp,
        color = Kabul
    ),
    headlineLarge = TextStyle(
        fontFamily = Ringbearer,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize36sp,
        lineHeight = TextSize48sp,
        letterSpacing = TextSize1sp,
        color = Kabul
    ),
    labelLarge = TextStyle(
        fontFamily = Ringbearer,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize16sp,
        lineHeight = TextSize20sp,
        letterSpacing = TextSize1sp,
        color = Kabul
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        fontSize = TextSize12sp,
        lineHeight = TextSize16sp,
        letterSpacing = TextSize1sp,
        color = Kabul
    ),
)
