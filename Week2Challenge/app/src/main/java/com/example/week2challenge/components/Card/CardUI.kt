package com.example.week2challenge.components.Card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2challenge.R
import com.example.week2challenge.ui.theme.poppinsFamily


@Composable
@Preview
fun CardUI(){
    OutlinedCard (
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier
            .size(width = 200.dp, height = 280.dp)

    ){
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Spacer(modifier = Modifier.height(12.dp))
            Image(painter = painterResource(id = R.drawable.pp), contentDescription = "profile pic",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape)
                    .height(12.dp)
                    .border(1.dp, Color.LightGray, CircleShape)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "HadroidStundio User",
                fontFamily = poppinsFamily,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge,
            )
            Text(text = "This dude is a visionary entrepreneur, leads useless startups in revolutionizing the fintech sector.",
                textAlign = TextAlign.Center,
                fontFamily = poppinsFamily,
                fontSize = 9.sp
            )

            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.Left,
                modifier = Modifier.fillMaxWidth()
            ){
                Icon(Icons.Filled.Email, contentDescription = "Emails")
                Text(text = "rawvintage@gmail.com", fontFamily = poppinsFamily)
            }
            OutlinedButton(onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(width = 150.dp, height = 35.dp)) {
                Text(text = "View Profile")
            }
        }
    }
}