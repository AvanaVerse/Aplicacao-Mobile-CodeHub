package com.example.codehub.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val CodeHubFontFamily = FontFamily.Default

val CodeHubTypography = Typography(

    // Main screen title
    headlineLarge = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 26.sp,
        lineHeight = 32.sp
    ),

    // Screen and section title
    headlineMedium = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),

    // Smaller section title
    headlineSmall = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 26.sp
    ),

    // Post and card title
    titleLarge = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 24.sp
    ),

    // User, community or item name
    titleMedium = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 22.sp
    ),

    // Small card title
    titleSmall = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),

    // Main content and form labels
    bodyLarge = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 22.sp
    ),

    // Descriptions and card content
    bodyMedium = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),

    // Metadata and secondary information
    bodySmall = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),

    // Button text
    labelLarge = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),

    // Tags and compact labels
    labelMedium = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),

    // Captions and pagination
    labelSmall = TextStyle(
        fontFamily = CodeHubFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
        lineHeight = 16.sp
    )
)