package com.example.cartodevisita

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartodevisita.ui.theme.CartãoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                CartãoDeVisita()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable

fun CartãoDeVisita() {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.veterinaria),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(220.dp)
                .padding(top = 20.dp)
        )

        Text(
            text = "Clara Saquiz ",
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 15.dp)
                .padding(bottom = 0.dp),
            lineHeight = 100.sp
        )

        Text(
            text = "Médica Veterinária",
            fontSize = 18.sp,
            color = Color.Black,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 10.dp)
                .padding(bottom = 0.dp),
            lineHeight = 100.sp
        )

    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


    }
}


@Composable
fun informacoes(caminhoImagem: Int, text: String) {


    Row(
    ) {
        Imagem(
            painter = painterResource(id = caminhoImagem),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(30.dp)
                .padding(top = 10.dp)

        )

        Text(
            fontSize = 15.sp,
            color = Color.Black,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 10.dp)
                .padding(bottom = 0.dp),
            lineHeight = 100.sp,
        )
    }
}