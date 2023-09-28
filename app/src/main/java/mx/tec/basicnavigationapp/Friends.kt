package mx.tec.basicnavigationapp

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import mx.tec.basicnavigationapp.ui.theme.BasicNavigationAppTheme

class Friends : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicNavigationAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Amigos(this)
                }
            }
        }
    }
}

@Composable
fun Amigos(activity: Activity? = null){
    // como agregar varios composables en un solo composable, osea usar contenedores
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Uno de mis grupos de amigos")
        Image(
            painter = painterResource(id = R.drawable.amigos1),
            contentDescription = "1"
        )
        Text( "Otro de ellos")
        Image(
            painter = painterResource(id = R.drawable.amigos2),
            contentDescription = "2"
        )
        HomePage(activity)
    }
}