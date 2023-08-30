package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class ProfileScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

                screenList()

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun profileScreen(){

    Column(){
        profileInformation("Josue Marroquin", painterResource(id = R.drawable.profilecoverpage))
    }


    //All profile settings
}

@Composable
fun profileInformation(profileName: String,painter:Painter){
    Box(
        modifier = Modifier.fillMaxWidth().height(300.dp)
    ){
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

    }
}

