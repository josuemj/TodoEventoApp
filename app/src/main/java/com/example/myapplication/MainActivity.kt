package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
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

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Text(
                modifier = Modifier.padding(start = 12.dp, end = 180.dp, top = 10.dp),
                text = "Your favorites",
                fontSize = 23.sp
            )

            //First Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ){

                concertCard(
                    painter = painterResource(id = R.drawable.deadmau),
                    contentDescription = "",
                    eventTittle = "Deamau5",
                    eventDescription = "Cube V3 Release"
                )

                concertCard(
                    painter = painterResource(id = R.drawable.oliver),
                    contentDescription = "",
                    eventTittle = "Oliver Heldens",
                    eventDescription = "HILO SOLD OUT"
                )

                concertCard(
                    painter = painterResource(id = R.drawable.garrix),
                    contentDescription = "",
                    eventTittle = "Martin Garrix",
                    eventDescription = "Will perfon soon"
                )

                concertCard(
                    painter = painterResource(id = R.drawable.guetta),
                    contentDescription = "",
                    eventTittle = "David Guetta",
                    eventDescription = "Playing 'Like I Do'"
                )


            }

            //Second row sports
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ){

                concertCard(
                    painter = painterResource(id = R.drawable.utmb),
                    contentDescription = "",
                    eventTittle = "UTMB 2023",
                    eventDescription = "Chamonix"
                )

                concertCard(
                    painter = painterResource(id = R.drawable.nbamatch),
                    contentDescription = "",
                    eventTittle = "LAL VS MEM",
                    eventDescription = "8:00 PM"
                )

                concertCard(
                    painter = painterResource(id = R.drawable.utg),
                    contentDescription = "",
                    eventTittle = "UTG 2023",
                    eventDescription = "Ultra Maraton Guatemala"
                )

                concertCard(
                    painter = painterResource(id = R.drawable.cilclistica),
                    contentDescription = "Vuelta ciclistica",
                    eventTittle = "Vuelta ciclistica",
                    eventDescription = "Etapa 2 110km +1000mD+"
                )

            }

            Text(
                modifier = Modifier.padding(start = 12.dp, end = 180.dp, top = 10.dp),
                text = "All concerts",
                fontSize = 18.sp
            )

            //All concerts row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ){

                concertCard(
                    painter = painterResource(id = R.drawable.billie),
                    contentDescription = "",
                    eventTittle = "Billie Eillish",
                    eventDescription = "Performing"
                )

                concertCard(
                    painter = painterResource(id = R.drawable.tisto),
                    contentDescription = "",
                    eventTittle = "Tiesto",
                    eventDescription = "Releasing 'Split'"
                )

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ){

                concertCard(
                    painter = painterResource(id = R.drawable.miko),
                    contentDescription = "",
                    eventTittle = "Youn Miko",
                    eventDescription = "Relasing 'Wiggy'"
                )

                concertCard(
                    painter = painterResource(id = R.drawable.bunny),
                    contentDescription = "",
                    eventTittle = "BAD BUNNY",
                    eventDescription = "Singing 'Un verano sin ti'"
                )

            }

        }
    }

}

//All custom widgets
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
                    modifier = Modifier
                        .width(22.dp)
                        .height(22.dp)
                )
        }
    }
}

@Composable
fun concertCard(
    painter: Painter,
    contentDescription: String,
    eventTittle: String,
    eventDescription: String
){
    
    Card(
        modifier = Modifier
            .width(185.dp)
            .height(240.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .background(Color(0xFFfbd9e5))
                .fillMaxSize()
        ){
            Text(
                modifier = Modifier.padding(top = 160.dp, start = 15.dp),
                text = eventTittle,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                modifier = Modifier.padding(top = 180.dp, start = 15.dp),
                text = eventDescription,
                fontSize = 14.sp,
            )

            Card(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp

            ){
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
            }
        }
    }

}



