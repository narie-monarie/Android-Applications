package com.example.week2challenge.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.week2challenge.components.button.GradientButton
import com.example.week2challenge.components.images.ImageContent
import com.example.week2challenge.ui.theme.poppinsFamily


@Composable
@Preview
fun CardUI(modifier: Modifier=Modifier){

    val gradient = Brush.horizontalGradient(listOf(Color(0xFF8066DD), Color(0xFFE355B0)))
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onSecondary
        ),
        modifier = Modifier.size(width = 240.dp, height = 400.dp),
        shape = RoundedCornerShape(6.dp)
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Row (horizontalArrangement = Arrangement.Absolute.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
        ){
            Icon(Icons.Filled.ArrowBack, contentDescription = "back", modifier = Modifier.size(16.dp), tint = MaterialTheme.colorScheme.onBackground)
            Spacer(modifier = Modifier.weight(1f))
            Icon(Icons.Outlined.FavoriteBorder, contentDescription = "back", modifier = Modifier.size(16.dp), tint = MaterialTheme.colorScheme.onBackground)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            ImageContent()
            Text(text = "Travis Scotlin",
                fontFamily = FontFamily.Cursive,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onBackground)
            Spacer(modifier = Modifier.height(4.dp))
            Box (
                Modifier.size(height = 40.dp, width = 150.dp)){
                Column (Modifier.padding(1.dp)){
                    Text(
                        text = "Senior Product Designer for anything important",
                        style = TextStyle(
                            lineHeight = 1.5.em
                        ),
                        fontFamily = poppinsFamily,
                        fontSize = 11.sp,
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

            }
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "zi icon",
                    tint = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.size(14.dp)
                )
                Text(text = "  theman@gmail.com",
                    fontFamily = poppinsFamily,
                    fontSize = 10.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            GradientButton(
                text = "View Profile",
                gradient = gradient,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 40.dp, start = 40.dp)
                    .size(40.dp)
            )

        }
    }
}