package com.example.composedesigns.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedesigns.R
import com.example.composedesigns.ui.theme.ComposeDesignsTheme

@Composable
fun OnboardingScreen() {
    Card {
        Box {


            Image(
                painter = painterResource(id = R.drawable.cardblur),
                contentDescription = "card background",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(27.dp)
            ) {
                Text(
                    "Explore and Mint NFTs",
                    color = Color.White.copy(0.8F),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    "You can sell and buy NFTs of the best artists in the world.",
                    color = Color.White.copy(0.8F),
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.padding(bottom = 27.dp))
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(percent = 30),
                    modifier = Modifier.border(
                        width = 1.dp,
                        color = Color.White.copy(0.5F),
                        shape = RoundedCornerShape(percent = 30)
                    )
                ) {
                    Text(
                        "Get Started Now",
                        modifier = Modifier.padding(horizontal = 40.dp, vertical = 5.dp),
                        fontSize = 15.sp, fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

@Composable
fun CardPreview() {
    ComposeDesignsTheme {
        OnboardingScreen()
    }
}

