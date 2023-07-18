package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                ComposeArticleApp()
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    ArticleCard(
        title = stringResource(id = R.string.title_jetpack_compose_tutorial),
        shortDescription = stringResource(id = R.string.compose_short_desc),
        longDescription = stringResource(id = R.string.compose_long_desc),
        imagePainter = painterResource(id = R.drawable.bg_compose_background),
        modifier = Modifier.padding(16.dp, 0.dp),
    )
}

@Composable
private fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column() {
        BannerImage(imagePainter)
        TitleText(title, modifier)
        ShortDescText(shortDescription, modifier)
        LongDescText(longDescription, modifier)
    }
}

@Composable
private fun BannerImage(imagePainter: Painter) {
    Image(
        painter = imagePainter,
        contentDescription = null,
        modifier = Modifier.fillMaxWidth(1f),
    )
}

@Composable
private fun TitleText(title: String, modifier: Modifier) {
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = modifier.padding(0.dp, 16.dp),
    )
}

@Composable
private fun ShortDescText(shortDescription: String, modifier: Modifier) {
    Text(
        text = shortDescription,
        textAlign = TextAlign.Justify,
        modifier = modifier,
    )
}

@Composable
private fun LongDescText(longDescription: String, modifier: Modifier) {
    Text(
        text = longDescription,
        textAlign = TextAlign.Justify,
        modifier = modifier.padding(0.dp, 16.dp),
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        ComposeArticleApp()
    }
}
