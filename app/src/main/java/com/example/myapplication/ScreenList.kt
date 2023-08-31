package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
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

    var eventsList = mutableListOf<Event>()
    
    //Creating random events
    var event_1 = Event("T","Taylow Swift","New Orleans")
    val event_2 = Event("D","Deadmau5","Guatemala City")
    val event_3 = Event("Y","Young Miko","Distrito Federal MX")
    val event_4 = Event("A","AC/DC","Mercedez Benz Arena")
    val event_5 = Event("A","Avicii","Staples Center")
    val event_6 = Event("Z","Esteban Z","Universidad del Valle")
    val event_7 = Event("G","Gerson Ramirez","UMG")
    val event_8 = Event("A","Young Miko","Mercedez Benz Arena")
    val event_9 = Event("A","Avicii","Staples Center")
    val event_10 = Event("Z","Esteban Z","Universidad del Valle")

    eventsList.add(event_1)
    eventsList.add(event_2)
    eventsList.add(event_3)
    eventsList.add(event_4)
    eventsList.add(event_5)
    eventsList.add(event_6)
    eventsList.add(event_7)
    eventsList.add(event_9)
    eventsList.add(event_10)


    LazyColumn() {
        items(items = eventsList) { event ->
            listElement(event = event)
        }
    }

}

@Composable
fun listElement(event:Event){
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
                        text = event.iconLetter,
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
                        text = event.groupName,
                        fontSize = 18.sp

                    )

                    Text(
                        text = event.place
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
                            .width(20.dp)
                            .height(20.dp),
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
                .background(Color(0xFFD8d8d8))
        ){

        }
    }


}

