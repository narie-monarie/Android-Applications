package com.example.composedesigns.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedesigns.collections
import com.example.composedesigns.ui.theme.ComposeDesignsTheme

@Composable
fun CollectionCard(title: String, image: Painter, likes: Int) {
    var isLiked by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .border(
                width = 1.dp,
                color = Color.White.copy(0.5f),
                shape = RoundedCornerShape(30.dp)
            )
    ) {
        Image(
            painter = image,
            contentDescription = "NFT Image",
            modifier = Modifier
                .height(155.dp)
                .width(155.dp)
                .padding(10.dp)
                .border(
                    width = 1.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(22.dp)
                )
                .fillMaxSize()
                .clip(RoundedCornerShape(22.dp))
        )
        Row(
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                title,
                fontSize = 15.sp,
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Left
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconToggleButton(checked = isLiked, onCheckedChange = {
                    isLiked = !isLiked
                }, modifier = Modifier.size(13.dp)) {
                    Icon(
                        tint = if (isLiked) {
                            Color.Red
                        } else {
                            Color(235, 235, 245).copy(0.6f)
                        },
                        imageVector = if (isLiked) {
                            Icons.Filled.Favorite
                        } else {
                            Icons.Default.FavoriteBorder
                        },
                        contentDescription = "Favourite Button"
                    )
                }
                Text(
                    if (isLiked) {
                        likes.toString()
                    } else {
                        "${likes - 1}"
                    },
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp,
                    textAlign = TextAlign.Right,
                    color = Color(235, 253, 245).copy(0.6f)
                )
            }
        }

    }

}

@Composable
@Preview
fun PreviewCollectionCard() {
    ComposeDesignsTheme {
        CollectionCard(
            collections[0].title,
            painterResource(id = collections[0].image),
            collections[0].likes
        )
    }
}