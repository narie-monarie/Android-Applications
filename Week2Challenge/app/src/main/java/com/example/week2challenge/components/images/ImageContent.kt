package com.example.week2challenge.components.images

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week2challenge.R
import com.example.week2challenge.ui.theme.Week2ChallengeTheme

@Composable
fun ImageContent(){
    val borderWidth = 2.dp
    Image(
        painter = painterResource(id = R.drawable.retard),
        contentDescription = "yes!",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(110.dp)
            .border(
                BorderStroke(borderWidth, MaterialTheme.colorScheme.onSurfaceVariant),
                CircleShape
            )
            .padding(borderWidth)
            .clip(CircleShape).shadow(elevation = 12.dp, shape = RoundedCornerShape(12.dp))
    )
}
