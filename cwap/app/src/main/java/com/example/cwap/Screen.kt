package com.example.cwap

sealed class Screen (val rout : String){
    object Home : Screen("home")
    object Second : Screen("second")
    object Last : Screen("last")
}