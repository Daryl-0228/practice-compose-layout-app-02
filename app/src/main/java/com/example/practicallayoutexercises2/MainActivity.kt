package com.example.practicallayoutexercises2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicallayoutexercises2.ui.theme.PracticalLayoutExercises2Theme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      PracticalLayoutExercises2Theme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          TasksCompletionMessageApp()
        }
      }
    }
  }
}

@Composable
fun TasksCompletionMessageApp() {
  CompletionItem(
    imagePainter = painterResource(R.drawable.ic_task_completed),
    completionMessage = stringResource(R.string.completion_message),
    tasksCompletionMessage = stringResource(R.string.tasks_completion_message)
  )
}

@Composable
fun CompletionItem(
  imagePainter: Painter,
  completionMessage: String,
  tasksCompletionMessage: String,
  modifier: Modifier = Modifier
) {
  Column(
    verticalArrangement = Arrangement.Center,
    modifier = modifier
  ) {
    Image(painter = imagePainter, contentDescription = null, modifier = Modifier.align(Alignment.CenterHorizontally))
    Text(
      text = completionMessage,
      fontWeight = FontWeight.Bold,
      modifier = Modifier
        .padding(top = 24.dp, bottom = 8.dp)
        .align(alignment = Alignment.CenterHorizontally)
    )
    Text(
      text = tasksCompletionMessage,
      fontSize = 16.sp,
      modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
    )
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  PracticalLayoutExercises2Theme {
    TasksCompletionMessageApp()
  }
}