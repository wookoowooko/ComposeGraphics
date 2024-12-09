package io.wookoo.composegraphics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.wookoo.composegraphics.components.BallGame
import io.wookoo.composegraphics.ui.theme.ComposeGraphicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeGraphicsTheme {
                BallGame()
            }
        }
    }
}


