package com.example.newsapp.model

import com.example.newsapp.R

data class NewsData(
    val id:Int,
    val title:String,
    val image:Int= R.drawable.breaking_news,
    val author:String,
    val description:String,
    val PublishedAt:String
)
