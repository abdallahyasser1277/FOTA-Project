package com.abdalllahyascer.fota.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abdalllahyascer.fota.R


@Composable
fun AboutScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(modifier = Modifier
            .padding(horizontal = 10.dp)
            .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "1- \nAbout Team Zero Members",
                color = MaterialTheme.colors.primary,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(30.dp))
            MemberCard(
                "Nady Mahmoud Abbas \n(team leader)", "Embedded Software Engineer" +
                        "\nBachelor's Degree of Computer Science Department" +
                        "\nborn in 1998" +
                        "\nay1277@fayoum.edu.eg" +
                        "\n+201023684509",
                R.drawable.nady
            )
            Spacer(modifier = Modifier.height(12.dp))
            MemberCard(
                "Abdallah Yasser Abdallah",
                "Android Developer (Kotlin/Jetpack Compose)" +
                        "\nBachelor's Degree of Computer Science Department" +
                        "\nborn in 1998" +
                        "\nay1277@fayoum.edu.eg" +
                        "\n+201023684509",
                R.drawable.helpbg
            )
            Spacer(modifier = Modifier.height(12.dp))
            MemberCard(
                "Mustafa Salah Emam",
                "Embedded Software Engineer" +
                        "\nBachelor's Degree of Computer Science Department" +
                        "\nborn in 2000" +
                        "\nay1277@fayoum.edu.eg" +
                        "\n+201023684509",
                R.drawable.mustafa
            )
            Spacer(modifier = Modifier.height(12.dp))
            MemberCard(
                "Ahmed Zahran ",
                "Full Stack Web developer" +
                        "\nBachelor's Degree of Computer Science Department" +
                        "\nborn in 2000" +
                        "\nay1277@fayoum.edu.eg" +
                        "\n+201023684509",
                R.drawable.zahran
            )

        }
    }
}

@Composable
fun MemberCard(name:String, bio :String, photoId:Int){
    Card(
        backgroundColor = Color(255,255,255,63),
        elevation = 0.dp,
        modifier = Modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colors.primary,
                shape = RoundedCornerShape(28.dp)
            )
            .clip(RoundedCornerShape(28.dp)),
    ){

        Row {
            Image(
                painter = painterResource(id = photoId),
                contentDescription = "",
                modifier = Modifier
                    .padding(4.dp)
                    .aspectRatio(1f)
                    .weight(1f)
                    .clip(RoundedCornerShape(24.dp))
            )
            Spacer(modifier = Modifier.width(4.dp))
            Column(modifier = Modifier.weight(2f)) {
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = name,
                    color = MaterialTheme.colors.primary,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold)
                Text(color = MaterialTheme.colors.primary,
                    text = bio)
                Spacer(modifier = Modifier.height(4.dp))
            }
        }
    }
}