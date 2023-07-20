package com.example.taskcompleted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskcompleted.ui.theme.TaskCompletedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompletedTheme {
                TaskCompletedScreen()
            }
        }
    }
}

@Composable
fun TaskCompletedScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        TaskCompletedImage(painterResource(id = R.drawable.ic_task_completed))
        TaskCompleteDescription(
            title = stringResource(id = R.string.all_task_completed),
            description = stringResource(id = R.string.nice_work),
        )
    }
}

@Composable
fun TaskCompletedImage(painterResource: Painter) {
    Image(painter = painterResource, contentDescription = null)
}

@Composable
fun TaskCompleteDescription(title: String, description: String) {
    Text(
        text = title,
        fontWeight = Bold,
        modifier = Modifier.padding(0.dp, 24.dp, 0.dp, 8.dp),
    )
    Text(
        text = description,
        fontSize = 16.sp,
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TaskCompletedScreen()
}
