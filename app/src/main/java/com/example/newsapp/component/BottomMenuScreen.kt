package com.example.newsapp.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector
import java.util.*

sealed class BottomMenuScreen(
    val route:String,
    val icon:ImageVector,
    val title:String


){
    object  TopNews:BottomMenuScreen("top news", icon = Icons.Outlined.Home,"Home")
}
