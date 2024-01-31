package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Branding()
                }
            }
        }
    }
}

@Composable
fun Branding(modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Color(0xFFAED09D))

        ) {
            Row() {
                Box(
                    Modifier
                        .size(100.dp)
                        .background(Color(0xFF0A2E48)),

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.android_logo),
                        contentDescription = "logo",
                        Modifier.height(160.dp)
                    )
                }
            }
            Text(
                text = "Adam Remaih",
                fontSize = 36.sp,

                )
            Text(
                text = "Android Developer Extraordinaire",
                color = Color(0xFF005e00),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 10.dp)

            )

        }

    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(){
            Column(
                modifier = Modifier.padding(bottom = 30.dp)
            ){
                Row(){
                    Icon(Icons.Rounded.Phone, contentDescription = "Phone Number")
                    Text(
                        text = "+11 (123) 444 555 666",
                        modifier = Modifier
                            .padding(bottom = 18.dp)
                            .padding(start = 15.dp)

                    )

                }
                Row(){
                    Icon(Icons.Rounded.Share, contentDescription = "Social Media")
                    Text(text = "@AndroidDev",
                        modifier = Modifier
                            .padding(bottom = 18.dp)
                            .padding(start = 15.dp)
                    )
                }
                Row(){
                    Icon(Icons.Rounded.Email, contentDescription = "Email")
                    Text(text = "jen.doe@android.com",
                        modifier = Modifier
                            .padding(bottom = 18.dp)
                            .padding(start = 15.dp)
                    )
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Branding()
    }
}