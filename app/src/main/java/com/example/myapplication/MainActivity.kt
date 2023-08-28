package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

                mainScreen()

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun mainScreen(){
    menu()
}


@Composable
fun menu(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        topBar()
    }

}

@Composable
fun topBar(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .background(color = Color(0xFFf3ecf6)) //Top bar color
    ) {

        Row(

            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {

                Text(
                    modifier = Modifier.padding(start = 25.dp, end = 180.dp, top = 10.dp),
                    text = "TodoEventos",
                    fontSize = 23.sp

                )

                Image(

                    painter = painterResource(id = R.drawable.threedots),
                    contentDescription = "",
                    modifier = Modifier.width(22.dp).height(22.dp)
                )

        }

    }
}



