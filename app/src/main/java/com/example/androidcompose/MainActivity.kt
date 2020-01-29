package com.example.androidcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.imageFromResource

import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    val context = +ambient(ContextAmbient)
    val image = imageFromResource(context.resources, R.drawable.header)
    MaterialTheme {
        val typography = +MaterialTheme.typography()
        Card(shape = RoundedCornerShape(8.dp)) {
            Column(
                modifier = Spacing(8.dp)
            ) {
                Container(modifier = Height(180.dp) wraps Expanded) {
                    Clip(shape = RoundedCornerShape(8.dp)) {
                        DrawImage(image)
                    }
            }
                HeightSpacer(16.dp)
                Text(
                    "A day in Shark Fin Cove",
                    style = typography.h6
                )
                Text(
                    "Davenport, California",
                    style = typography.body2
                )
                Text(
                    "December 2018",
                    style = typography.body2
                )
        }
        
    }

        }

    }


@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}