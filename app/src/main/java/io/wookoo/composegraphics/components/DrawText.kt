package io.wookoo.composegraphics.components

import android.graphics.Color
import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DrawText() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawContext.canvas.nativeCanvas.apply {
            drawText(
                "This is my text",
                100f,
                100f,
                Paint().apply {
                    color = Color.RED
                    textSize = 100f
                }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun DrawTextPreview() {
    DrawText()
}