package com.example.composedesigns.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedesigns.ui.theme.ComposeDesignsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "NFT Marketplace",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp,
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(Color.Transparent),
            )
        },
        containerColor = Color(33, 17, 52)
    ) { it ->
        Column(
            Modifier
                .padding(horizontal = 16.dp)
                .padding(it)
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