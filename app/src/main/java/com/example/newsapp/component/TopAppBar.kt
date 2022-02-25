package com.example.newsapp.component

import androidx.activity.OnBackPressedCallback
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun TopAppBar(onBackPressed: ()->Unit={}){
    TopAppBar(title ={Text(text="Detail Screen",fontWeight=FontWeight.SemiBold)},
    navigationIcon = {
        IconButton(onClick = { onBackPressed()}) {
            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription ="" )

        }
    }
        )
}