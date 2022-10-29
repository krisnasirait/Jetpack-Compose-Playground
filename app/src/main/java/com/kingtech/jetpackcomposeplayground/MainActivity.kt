package com.kingtech.jetpackcomposeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RealMessageCard(
                Message(
                    "Krisna",
                    "Test for the multi parameter"
                )
            )
        }
    }

    // Compose with parameter
    @Composable
    fun MessageCard(name: String) {
        Text(text = "Hello $name")
    }


    // Preview in Composeable
    @Preview
    @Composable
    fun PreviewMessageCard() {
        Text(text = "Hello World")
    }

    data class Message(val author: String, val body: String)

    // Using multiple data
    // Using column
    @Composable
    fun RealMessageCard(msg: Message) {
        Row {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Backround"
            )
            Column {
                Text(text = msg.author)
                Text(text = msg.body)
            }
        }
    }


}