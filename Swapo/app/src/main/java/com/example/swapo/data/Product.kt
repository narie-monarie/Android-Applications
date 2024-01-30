package com.example.swapo.data

import androidx.compose.ui.graphics.vector.ImageVector

data class Product(
    val image: Int,
    val icon: ImageVector,
    val description: String,
    val price: Float,
)