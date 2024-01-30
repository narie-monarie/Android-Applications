package com.example.viewmodels

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.viewmodels.ui.theme.ViewmodelsTheme

class MainActivity : ComponentActivity() {
    private val viewmodel by viewModels<ContactViewModel> ()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewmodelsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewmodel.backgroundColor
                ) {
                    Button(onClick = {viewmodel.changeBackgroundColor()}) {
                        Text("Click Me Please")
                    }
                }
            }
        }
    }
}