package mx.tec.basicnavigationapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import mx.tec.basicnavigationapp.ui.theme.BasicNavigationAppTheme

class Hobbys : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicNavigationAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    textoImagen(this)
                }
            }
        }
    }
}

@Composable
fun textoImagen(activity: Activity? = null){
    // como agregar varios composables en un solo composable, osea usar contenedores
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Uno de mis hobbys es hacer hiking")
        Image(
            painter = painterResource(id = R.drawable.hiking),
            contentDescription = "hiking"
        )
        Text( "Otro de ellos es ver peliculas")
        Image(
            painter = painterResource(id = R.drawable.pelis),
            contentDescription = "peliculas"
        )
        HomePage(activity)
    }
}


@Composable
fun HomePage(activity: Activity? = null) {
    Button(onClick = {
        activity?.finish()
    }) {
        Text("Exit", fontWeight = FontWeight.Bold)
    }
}
