package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Switch

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class ProfileScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

                profileScren()

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun profileScren(){

    val checkedState = remember { mutableStateOf(true) }


    Column {
        profileContent()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        ){
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically
            ){

                Box(
                    modifier = Modifier
                        .width(90.dp)
                        .height(100.dp)
                        .padding(10.dp),
                    contentAlignment = Alignment.Center
                ){
                    profileIcon(myPainter = painterResource(id = R.drawable.usericon))
                }
                Text("Edit Profile", fontSize = 18.sp, modifier = Modifier.padding(end = 100.dp))
                profileIconButton()

            }

        }
        divider()

        //Second option
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
        ){
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically
            ){

                Box(
                    modifier = Modifier
                        .width(90.dp)
                        .height(90.dp)
                        .padding(10.dp),
                    contentAlignment = Alignment.Center
                ){
                    profileIcon(myPainter = painterResource(id = R.drawable.padlock))
                }
                Text("Reset Password", fontSize = 18.sp, modifier = Modifier.padding(end =60.dp))
                profileIconButton()

            }

        }

        //Third option - Edit profile
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
        ){
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically
            ){

                Box(
                    modifier = Modifier
                        .width(90.dp)
                        .height(90.dp)
                        .padding(10.dp),
                    contentAlignment = Alignment.Center
                ){
                    profileIcon(myPainter = painterResource(id = R.drawable.usericon))
                }
                Text("Show Notifications", fontSize = 18.sp, modifier = Modifier.padding(end = 60.dp))
                Switch(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it },
                    modifier = Modifier
                        .padding(0.dp),)

            }

        }
        divider()
        //fourth option
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
        ){
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically
            ){

                Box(
                    modifier = Modifier
                        .width(90.dp)
                        .height(90.dp)
                        .padding(10.dp),
                    contentAlignment = Alignment.Center
                ){
                    profileIcon(myPainter = painterResource(id = R.drawable.iconstar))
                }
                Text("Favorites", fontSize = 18.sp, modifier = Modifier.padding(end = 110.dp))
                profileIconButton()

            }

        }
    }




}

@Composable
fun  profileContent(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.profilecoverpage),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        imageProfile()


    }
}

@Composable
fun imageProfile(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .background(Color.White, shape = CircleShape.also {})
        ){
            Image(
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.elrubius),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        
        Text(
            text = "EL RUBIUS" ,
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier.padding(10.dp)
        )

    }
}

@Composable fun profileIcon(myPainter: Painter){
    Icon(
        modifier = Modifier
            .height(30.dp)
            .width(30.dp),
        painter = myPainter,
        contentDescription = null
    )
}

@Composable
fun profileIconButton(){
    IconButton(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
    )
    {
        Icon(
            modifier = Modifier
                .width(20.dp)
                .height(20.dp),
            painter = painterResource(id = R.drawable.icontriangle),
            contentDescription = null
        )
    }
}

@Composable
fun divider(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color(0xFFD8d8d8))
    ){

    }
}