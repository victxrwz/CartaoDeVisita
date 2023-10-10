package com.example.cartodevisita

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.leanback.widget.Row
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
        modifier = Modifier.background(Color(191, 146, 107)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 170.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val borderWidth = 4.dp
            Image(
                painter = painterResource(id = R.drawable.veterinaria),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)

                    .size(190.dp)
                    .border(
                        BorderStroke(
                            borderWidth,
                            Color.White
                        ),
                        CircleShape
                    )

            )

            Text(
                text = "Clara Saquiz Spellman",
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
            verticalArrangement = Arrangement.spacedBy(5.dp),

        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Image(
                    painter = painterResource(id = R.drawable.telefonefundo),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .border(
                            BorderStroke(
                                1.dp,
                                Color.White
                            )
                        )
                        .padding(4.dp, )


                )
                Text(
                    text = "+55 (11) 940028922",
                    fontFamily = FontFamily.Default,
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier

                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.instagramfundo),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .border(
                            BorderStroke(
                                1.dp,
                                Color.White
                            )
                        )
                        .padding(4.dp)

                )
                Text(
                    text = "@clarasaquiz",
                    fontFamily = FontFamily.Default,
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier

                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(id = R.drawable.gmailfundo),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .border(
                            BorderStroke(
                                1.dp,
                                Color.White
                            )
                        )
                        .padding(4.dp)

                )
                Text(
                    text = "clarasa@gmail.com",
                    fontFamily = FontFamily.Default,
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier

                )
            }
        }
    }

}

