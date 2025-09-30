package com.qilin.daggerfast

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.qilin.daggerfast.ui.theme.DaggerDemoTheme
import com.qilin.daggerfast.user.UserActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DaggerDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center, // 垂直居中
                        horizontalAlignment = Alignment.CenterHorizontally // 水平居中
                    ) {
                        Greeting(name = "Android")
                        Spacer(modifier = Modifier.height(16.dp)) // 两个元素之间加间距
                        LoginActivityLogin(
                            modifier = Modifier
                                .clickable {
                                    // 这里写点击事件逻辑
                                    println("LoginActivityLogin clicked!")
                                    // 跳转到LoginActivity
                                     startActivity(
                                         Intent(
                                             this@MainActivity,
                                             UserActivity::class.java
                                         )
                                     )
                                }
                        )
                    }
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

@Composable
fun LoginActivityLogin(modifier: Modifier = Modifier) {
    Text(
        text = "Login Activity",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DaggerDemoTheme {
        Greeting("Android")
    }
}