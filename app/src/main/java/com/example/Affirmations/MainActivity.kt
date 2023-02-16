package com.example.Affirmations

import androidx.compose.runtime.Composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.Affirmations.data.Datasource
import com.example.Affirmations.model.Affirmation
import com.example.Affirmations.ui.theme.AndroidKotlinComposeBasicsTheme
import com.example.androidkotlincomposebasics.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Surface(modifier = Modifier.fillMaxSize()) {
                AffirmationApp()
            }

        }
    }
}

@Composable
fun AffirmationApp() {
    AndroidKotlinComposeBasicsTheme {
        AffirmationList(Datasource().loadAffirmations())
    }
}

@Composable
fun AffirmationCard(
    affirmation: Affirmation,
    modifier: Modifier = Modifier
) {

    Column()
    {
        Image(
            painter = painterResource(id = affirmation.drawableResourceId),
            contentDescription = stringResource(id = affirmation.stringResourceId),
            modifier = modifier.fillMaxWidth().height(160.dp).padding(16.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            text = stringResource(id = affirmation.stringResourceId),
            fontSize = 16.sp,
            modifier = Modifier.padding(16.dp)
                .align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.headlineSmall
        )
    }

}

@Composable
private fun AffirmationList(
    affirmationList: List<Affirmation>,
    modifier: Modifier = Modifier
) {
    LazyColumn {
        items(affirmationList) { affirmation ->
            AffirmationCard(affirmation)
            Divider(color = Color.Cyan)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AffirmationCardPreview() {
    AndroidKotlinComposeBasicsTheme {
        AffirmationApp()
    }
}