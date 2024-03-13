package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content(
                        header = stringResource(R.string.header),
                        string1 = stringResource(R.string.string1),
                        string2 = stringResource(R.string.string2)
                    )
                }
            }
        }
    }
}

@Composable
fun Content(string1 : String, string2 : String, header : String) {
    val image = painterResource(R.drawable.bg)
    Column(verticalArrangement = Arrangement.Top) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = header,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = string1,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = string2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Content(
            header = stringResource(R.string.header),
            string1 = stringResource(R.string.string1),
            string2 = stringResource(R.string.string2)
        )
    }
}