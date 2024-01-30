package com.example.composedesigns.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedesigns.ui.theme.ComposeDesignsTheme

@Composable
fun HomeScreen() {
    Scaffold(
        containerColor = Color(33, 17, 52)
    ) { it ->
        Column(
            Modifier
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            CategoryList()
            Text(
                "Trending Collections",
                fontSize = 20.sp,
                color = Color.White.copy(0.8F),
                fontWeight = FontWeight.SemiBold
            )
            CollectionList()
            Text(
                "Best Sellers",
                fontSize = 20.sp,
                color = Color.White.copy(0.8F),
                fontWeight = FontWeight.SemiBold

            )
            NFTList()
        }
    }

}

@Preview
@Composable
fun PreviewHomeScreen() {
    ComposeDesignsTheme {
        HomeScreen()
    }
}