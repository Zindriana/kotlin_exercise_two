package com.example.kotlin_exercise_learn_together

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_exercise_learn_together.ui.theme.Kotlin_exercise_learn_togetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlin_exercise_learn_togetherTheme {
                Column {
                    TopImage()
                    Title()
                    BreadTextOne()
                    BreadTextTwo()
                }
            }
        }
    }
}

@Composable
fun TopImage(){
    val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null
    )
}


@Composable
fun Title(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.jetpack_compose_tutorial),
        fontSize = 24.sp,
        modifier = modifier
            .padding(16.dp)
    )
}

@Composable
fun BreadTextOne(modifier: Modifier = Modifier){
    Text(
        text = stringResource(R.string.text_one),
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
        modifier = modifier
            .padding(16.dp)
    )
}

@Composable
fun BreadTextTwo(modifier: Modifier = Modifier){
    Text(
        text = stringResource(R.string.text_two),
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
        modifier = modifier
                .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Kotlin_exercise_learn_togetherTheme {
        Column {
            TopImage()
            Title()
            BreadTextOne()
            BreadTextTwo()
        }
    }
}