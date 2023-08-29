package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Shapes

class ScreenList : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

              screenList()

            }
        }
    }
}



data class Event(val iconLetter: String, val groupName: String,val place:String)


@Preview(showBackground = true)
@Composable
fun screenList(){

    var eventsList = remember {
        mutableStateListOf<Event>()
    }

}

@Composable
fun listElement(iconLetter: String,groupName: String, eventPlace: String){
    Column() {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.White),

        ){
            //Al elements inside place
            Row(

            ){

                //ContactCircle
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .padding(10.dp)
                        .align(Alignment.CenterVertically)
                        .background(color = Color(0xFFEBD0F9), shape = CircleShape.also {}
                        ),


                ){
                    Text(
                        modifier = Modifier.align(Alignment.Center),
                        text = iconLetter,
                        fontSize = 30.sp,
                        color = Color(0xFF5b2679)
                    )
                }

                //TextInformation
                Column(
                    Modifier
                        .padding(5.dp)
                        .align(Alignment.CenterVertically)
                        .width(200.dp)
                ) {

                    Text(
                        text = groupName,
                        fontSize = 18.sp

                    )

                    Text(
                        text = eventPlace
                    )
                }
                
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                )
                {
                    Icon(
                        modifier = Modifier
                            .width(25.dp)
                            .height(25.dp),
                        painter = painterResource(id = R.drawable.icontriangle),
                        contentDescription = null
                    )
                }


            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.Gray)
        ){

        }
    }


}