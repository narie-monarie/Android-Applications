package com.example.composedesigns

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.composedesigns.home.HomeScreen

@Composable
fun RootScreen() {
    Scaffold { it ->
        HomeScreen()
    }
}