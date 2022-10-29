package com.kingtech.jetpackcomposeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = "Krisna")
        }
    }
    
    @Composable
    fun MessageCard(name: String) {
        Text(text = "Hello $name")
    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        Text(text = "Hello World")
    }


}