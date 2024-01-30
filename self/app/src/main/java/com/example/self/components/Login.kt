package com.example.self.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.self.ui.theme.SelfTheme

@Composable
fun PasswordTextField(
    modifier: Modifier=Modifier,
    value:String,
    onValueChanged: (String) -> Unit,
    placeholder: String
) {
        OutlinedTextField(value,
            onValueChange = onValueChanged,
            modifier = Modifier.padding(10.dp),
            shape = RoundedCornerShape(10.dp),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = ""
                )
            },
            placeholder = { Text(placeholder) }
        )
    }
@Composable
fun LoginPage(
    modifier: Modifier=Modifier,
    placeholder: String,
    value:String,
    onValueChanged:(String)->Unit
) {
        OutlinedTextField(value,
            onValueChange = onValueChanged,
            modifier = Modifier.padding(10.dp),
            shape = RoundedCornerShape(10.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            placeholder = { Text(placeholder) }
        )
    }


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PrevLoginPage(){
    SelfTheme {
        PasswordTextField(modifier = Modifier.padding(top = 12.dp), value = "", onValueChanged = {}, placeholder ="Enter Password" )
    }
}
