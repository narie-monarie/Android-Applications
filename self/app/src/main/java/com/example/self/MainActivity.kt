package com.example.self

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.self.components.LoginPage
import com.example.self.components.PasswordTextField
import com.example.self.ui.theme.SelfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelfTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Logins()
                }
            }
        }
    }
}

@Composable
@Preview
fun Logins(){
    Scaffold {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            //LoginPage()
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(50.dp)
                    .width(280.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0, 237, 100)),
                border = BorderStroke(1.dp, color = Color.Black)
            ) {
                Text("LOGIN", color = Color.Black, fontWeight = FontWeight.SemiBold)
                LoginPage(placeholder = "Email", value = "Email", onValueChanged = {})
                Spacer(modifier = Modifier.height(12.dp))
                PasswordTextField(value = "Password", onValueChanged = {}, placeholder ="Password" )
            }
        }
    }
}