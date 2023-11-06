package com.satyamthakur.learning.tweetverse

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.satyamthakur.learning.tweetverse.networking.TweetsRetrofitAPI
import com.satyamthakur.learning.tweetverse.screens.CategoryScreen
import com.satyamthakur.learning.tweetverse.screens.DetailScreen
import com.satyamthakur.learning.tweetverse.ui.theme.TweetVerseTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            TweetVerseTheme {
                // A surface container using the 'background' color from the theme
                DetailScreen()
            }
        }
    }
}
