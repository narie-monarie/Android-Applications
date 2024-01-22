package com.example.readthrough

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.readthrough.ui.theme.ReadThroughTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReadThroughTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HorPage()
                }
            }
        }
    }
}


@Composable
fun ArtistCard(){
    Row(verticalAlignment = Alignment.CenterVertically){
        Box {
            Image(painter = painterResource(id = R.drawable.stop_sign), contentDescription = "stop image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape))
            Icon(Icons.Filled.CheckCircle, contentDescription = "check mark", modifier = Modifier.size(20.dp))
        }
        Column {
            Text("Alfred Sisley", fontWeight = FontWeight.Bold)
            Text(text = "online 3 minutes Ago", fontSize = 10.sp)
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Preview(device = "id:pixel_7", showSystemUi = true, showBackground = true)
@Composable
fun HorPage(){
    val pagerState = rememberPagerState (pageCount = {
        10
    })

    HorizontalPager(state = pagerState) {page->
        Row (Modifier.fillMaxWidth()){

            Image(
                painter = painterResource(id = R.drawable.one),
                contentDescription = "1",
                Modifier.size(200.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.two),
                contentDescription = "2",
                Modifier.size(200.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.three),
                contentDescription = "3",
                Modifier.size(200.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.four),
                contentDescription = "4",
                Modifier.size(200.dp)
            )
        }
        Text(
            "Page: $page",
            modifier = Modifier.fillMaxWidth()
        )
        
    }
}