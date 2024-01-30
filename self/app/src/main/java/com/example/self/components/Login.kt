package com.example.self.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun LoginPage(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("LOGIN", fontSize = 41.sp,
            fontWeight = FontWeight.Bold)
        OutlinedTextField("Email",
            onValueChange = {},
            modifier = Modifier.padding(10.dp),
            shape = RoundedCornerShape(10.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Email,contentDescription = "")}
        )

        OutlinedTextField("Password",
            onValueChange = {},
            modifier = Modifier.padding(10.dp),
            shape = RoundedCornerShape(10.dp),
           trailingIcon = { Icon(imageVector = Icons.Default.CheckCircle,contentDescription = "")}
        )
        
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .height(50.dp)
                .width(280.dp),
            shape = RoundedCornerShape(10.dp),

            border = BorderStroke(1.dp, color = Color.Black)
            ) {
           Text("LOGIN")
        }
    }
}