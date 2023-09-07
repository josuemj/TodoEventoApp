package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            Text(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(10.dp),
                fontSize = 16.sp,
                text = "Lugar"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .weight(1f)
        ){

            Column() {
                Text(
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 20.dp),
                    fontSize = 22.sp,
                    text = "Title",
                )
                //Row Information

                Row(
                    modifier = Modifier.height(40.dp).padding(start=10.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .width(30.dp)
                            .height(30.dp)
                            .align(Alignment.CenterVertically),
                        painter = painterResource(id = R.drawable.calendaricon),
                        contentDescription = null)

                    Text(
                        modifier = Modifier.align(Alignment.CenterVertically),
                        text = "Fecha",
                        fontSize = 16.sp
                    )

                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 250.dp),
                        text = "Hora",
                        fontSize = 16.sp
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp)
                ){
                    Column() {
                        Text(
                            modifier = Modifier.padding(start =12.dp, bottom = 5.dp),
                            text="About",
                            fontSize = 18.sp

                        )

                        Text(
                            modifier = Modifier.padding(start =12.dp,end=20.dp),
                            text="Amidst the gentle rustling of leaves " +
                                    "and the distant chirping of birds, a " +
                                    "sense of tranquility fills the air. The " +
                                    "sun casts a warm golden glow, painting " +
                                    "the sky in hues of orange and pink as it" +
                                    " begins its slow descent. Nature seems to " +
                                    "pause in reverence to this serene moment, " +
                                    "creating a perfect symphony of calmness and beauty.",
                            fontSize = 14.sp
                        )
                    }
                }
                
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(170.dp)
                            .padding(end = 5.dp)
                            .height(40.dp),
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(Color(0xFFEBD0F9))
                    ) {
                        Text(
                            text = "Favorite",
                            color = Color.Black
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(170.dp)
                            .padding(start = 5.dp)
                            .height(40.dp),
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(Color(0xFFEBD0F9))
                    ) {
                        Text(
                            text = "Buy",
                            color = Color.Black
                        )
                    }
                }

            }

        }


    }
}

