package io.wookoo.composegraphics.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyCanvas() {
    Canvas(modifier = Modifier
        .padding(20.dp)
        .size(300.dp)) {
        drawRect(
            color = Color.Black,
            size = size
        )
        drawRect(
            color = Color.Red,
            topLeft = Offset(100f, 100f),
            size = Size(100f, 100f),
            style = Stroke(
                width = 5f, // or 5.dp.toPx()

            )
        )
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(Color.Red, Color.Yellow),
                center = center,
                radius = 100f
            ),
            radius = 100f,
        )
        drawArc(
            color = Color.Green,
            startAngle = 0f,
            sweepAngle = 270f,
            useCenter = true,
            topLeft = Offset(100f, 500f),
            size = Size(200f, 200f),
        )

        drawArc(
            color = Color.Cyan,
            startAngle = 0f,
            sweepAngle = 270f,
            useCenter = false,
            topLeft = Offset(100f, 300f),
            size = Size(200f, 200f),
        )

        drawArc(
            color = Color.Blue,
            startAngle = 0f,
            sweepAngle = 270f,
            useCenter = false,
            topLeft = Offset(600f, 300f),
            size = Size(200f, 200f),
            style = Stroke(
                width = 5.dp.toPx()
            )
        )
        drawOval(
            color = Color.Magenta,
            topLeft = Offset(450f, 20f),
            size = Size(200f, 300f)
        )

        drawLine(
            color = Color.LightGray,
            start = Offset(300f, 700f),
            end = Offset(700f, 700f),
            strokeWidth = 5.dp.toPx()
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun MyCanvasPreview() {
    MyCanvas()
}
