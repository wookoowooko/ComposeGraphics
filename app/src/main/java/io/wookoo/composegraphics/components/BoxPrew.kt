
package io.wookoo.composegraphics.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BoxPrew() {
    Box(modifier = Modifier.fillMaxSize()
        .drawBehind {

        }) {

    }
}

@Composable
@Preview(showBackground = true)
private fun BoxPrewPreview() {
    BoxPrew()
}
