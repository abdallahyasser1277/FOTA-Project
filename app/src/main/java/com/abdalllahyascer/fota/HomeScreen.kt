package com.abdalllahyascer.fota

import android.graphics.drawable.shapes.Shape
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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.MultiParagraph
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abdalllahyascer.fota.ui.theme.FOTATheme


@Composable
fun HomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.primary),
        contentAlignment = Alignment.Center
    ){

        Column(modifier = Modifier
            .padding(horizontal = 10.dp)
            .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            
            Spacer(modifier = Modifier.height(60.dp))
            Text(
                text = "Welcome to Firmware over the Air Project App",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(30.dp))
            Section("Short story about FOTA",stringResource(id = R.string.Short_story_about_Fota),R.drawable.bg3)

            Spacer(modifier = Modifier.height(30.dp))
            Section("How To Use the Firmware over the Air",stringResource(id = R.string.How_To_Use_the_Firmware_over_the_Air),R.drawable.bg3)

            Spacer(modifier = Modifier.height(30.dp))
            Section("Make it easy to Upgrade your Product",stringResource(id = R.string.Make_it_easy_to_Upgrade_your_Product),R.drawable.bg3)

            Spacer(modifier = Modifier.height(30.dp))
            Section("Choice the best for you",stringResource(id = R.string.Choice_the_best_for_you),R.drawable.bg3)

        }
    }
}


@Composable
fun Section(title:String,paragraph:String,photoId: Int){

    Card(
        backgroundColor = Color(255,255,255,63),
        elevation = 0.dp,
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.White.copy(0.3f),
                shape = RoundedCornerShape(28.dp)
            )
            .clip(RoundedCornerShape(28.dp)),
    ) {
//        Image(
//        modifier = Modifier
//            .fillMaxSize()
//            .aspectRatio(0.6f),
//        painter = painterResource(id = photoId),
//        contentDescription = "",
//        contentScale = ContentScale.Crop
//        )
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(28.dp),
        ){
            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                text = title )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                modifier = Modifier,
                textAlign = TextAlign.Center,
                color = Color.White,
                text = paragraph )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
                shape = RoundedCornerShape(percent = 50),
                modifier = Modifier.border(
                    width = 1.dp,
                    color = Color.White.copy(0.3f),
                    shape = RoundedCornerShape(28.dp)
                ),
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary, contentColor = Color.White),
                onClick = { /*TODO*/ }
            ) {
                Text(
                    fontSize = 14.sp,
                    modifier = Modifier.padding(horizontal = 40.dp, vertical = 8.dp),
                    text = "Learn More" )
            }
        }

    }
}
