package com.example.slack_compose_lint

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.slack_compose_lint.ui.theme.SlackcomposelintTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SlackcomposelintTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SlackcomposelintTheme {
        Greeting("Android")
    }
}

@Composable
fun BadComposable() {
    val list = listOf(1, 2, 3)
    LazyColumn {
        items(list) { item ->
            Text("Item: $item")
        }
    }
}

@Composable
fun BadComposable2() {
    val list = listOf(1, 2, 3)
    LazyColumn {
        items(list) { item ->
            Text("Item: $item")
        }
    }
}

@Composable
fun BadComposable3() {




    val list = listOf(1, 2, 3)

    var APOD:Any
    LazyColumn {
        items(list) { item ->
            Text("Item: $item")
        }
    }
}