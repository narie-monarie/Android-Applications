package com.example.bankingapplication.components.homepage

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.bankingapplication.data.Finance
import com.example.bankingapplication.ui.theme.BlueStart
import com.example.bankingapplication.ui.theme.GreenStart
import com.example.bankingapplication.ui.theme.OrangeStart
import com.example.bankingapplication.ui.theme.PurpleStart

val finance: List<Finance> = listOf(
    Finance(
        icon = Icons.Rounded.StarHalf,
        name = "My\nBusiness",
        background = OrangeStart,
    ),

    Finance(
        icon = Icons.Rounded.Wallet,
        name = "My\nWallet",
        background = BlueStart,
    ),

    Finance(
        icon = Icons.Rounded.StarHalf,
        name = "Finance\nAnalytics",
        background = PurpleStart,
    ),

    Finance(
        icon = Icons.Rounded.StarHalf,
        name = "My\nTransactions",
        background = GreenStart,
    ),
)

@Preview
@Composable
fun FinanceSection() {
    Column {
        Text(
            text = "Finance",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}