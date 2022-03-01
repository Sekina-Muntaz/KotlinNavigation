package com.example.newsapp.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.newsapp.R

import com.example.newsapp.component.TopAppBar
import com.example.newsapp.models.NewsData
import com.example.newsapp.models.TopNewsArticle
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun DetailScreen(scrollState: ScrollState,article: TopNewsArticle,navController: NavController){
    Scaffold(topBar ={
        TopAppBar(onBackPressed = {navController.popBackStack()})
    } )
    {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Detail Screen", fontWeight = FontWeight.SemiBold)
            CoilImage(
                imageModel = article.urlToImage,
                contentScale = ContentScale.Crop,
                error = ImageBitmap.imageResource(R.drawable.breaking_news),
                placeHolder = ImageBitmap.imageResource(R.drawable.breaking_news)
            )
//            Image(painter = painterResource(id = R.drawable.breaking_news), contentDescription = "")
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                InfoWithIcon(icon = Icons.Default.Edit, info =article.author?:"Not Available")
                InfoWithIcon(icon = Icons.Default.DateRange, info =article.publishedAt!! )

            }
            Text(text = article.title!!, fontWeight = FontWeight.Bold)
            Text(text = article.description!!, modifier = Modifier.padding(top=16.dp))
//        Button(onClick = {
//            navController.popBackStack()
//        }) {
//            Text(text = "Go to TopNews + ${newsData.author}")
//
//        }

        }
    }

}
@Composable
fun InfoWithIcon(icon: ImageVector,info:String){
  Row() {
      Icon(icon, contentDescription = "Author", 
          modifier = Modifier.padding(8.dp),
      colorResource(id = R.color.purple_500)
      )
      Text(text = info, modifier = Modifier.padding(8.dp))
  }
    
}





//@Preview(showBackground = true)
//@Composable
//fun DetailScreenPreview(){
//    DetailScreen(
//        rememberScrollState(),
//
//        NewsData(
//            1,
//            "News title something catchy",
//            R.drawable.breaking_news,
//
//            "Lorem Ipsum",
//            "Lorem Ipsum sic donec",
//            "2021-11-04T4: 42:40Z"),
//        rememberNavController()
//    )

//}