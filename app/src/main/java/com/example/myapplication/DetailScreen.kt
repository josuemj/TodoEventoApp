package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class DetailScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

                detailsScren()

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun detailsScren(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFfbd9e5))
                .weight(1f)
        ){

        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .weight(1f)
        ){

            Column() {
                Text(text = "Title")
                //Row Information

                Row() {
                    Icon(
                        modifier = Modifier.width(20.dp).height(20.dp),
                        painter = painterResource(id = R.drawable.calendaricon),
                        contentDescription = null)
                    Text(text = "fecha")
                    Text(text = "Hora")
                }
                Text(text="About")
                Text(text="Paragraph.....")
            }

        }


    }
}

