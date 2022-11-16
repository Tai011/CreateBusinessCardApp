package com.example.createbusinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.createbusinesscardapp.ui.theme.CreateBusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreateBusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface{  CreateBusinessCard()
                Contact()
                ContactPicture()}
                Social()
                SocialPicture()
                Email()
                EmailPicture()

                }
            }
        }
    }


@Composable
fun CreateBusinessCard(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image=painterResource(R.drawable.account)
        Image(painter = image , contentDescription=null,Modifier.size(80.dp,80.dp))
        Text(
            text= stringResource(R.string.FullName),
                    fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                top = 30.dp,
                bottom = 10.dp)
        )
        Text(
            text = stringResource(R.string.Title),
            fontSize = 20.sp
        )
    }

}
@Composable
fun ContactPicture(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(top = 240.dp, start = 0.dp, end = 200.dp, bottom = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        val image=painterResource(R.drawable.phone)
        Image(painter = image , contentDescription=null,Modifier.size(30.dp,50.dp))

    }

}
@Composable
fun Contact(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(top = 220.dp, start = 0.dp, end = 0.dp, bottom = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
    Text(
        text= stringResource(R.string.phone),
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(
            top = 30.dp,
            bottom = 10.dp)
    )
}

}

@Composable
fun SocialPicture(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(top = 320.dp, start = 0.dp, end = 200.dp, bottom = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        val image=painterResource(R.drawable.feed)
        Image(painter = image , contentDescription=null,Modifier.size(30.dp,50.dp))

    }


}

@Composable
fun Social(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(top = 300.dp, start = 0.dp, end = 0.dp, bottom = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text= stringResource(R.string.social),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                top = 30.dp,
                bottom = 10.dp)
        )
    }
}

@Composable
fun Email(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(top = 380.dp, start = 0.dp, end = 0.dp, bottom = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text= stringResource(R.string.email),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                top = 30.dp,
                bottom = 10.dp)
        )
    }

}

@Composable
fun EmailPicture(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(top = 400.dp, start = 0.dp, end = 200.dp, bottom = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        val image=painterResource(R.drawable.baseline_email_black_24dp)
        Image(painter = image , contentDescription=null,Modifier.size(30.dp,50.dp))

    }


}



