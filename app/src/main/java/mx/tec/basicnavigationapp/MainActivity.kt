package mx.tec.basicnavigationapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import mx.tec.basicnavigationapp.ui.theme.BasicNavigationAppTheme

// vamos a utilizar estados (ahorita lo definimos)
// para ello necesitamos importar algunos recursos

import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // sintaxis general de invocacion de composables:
        //nombre de composable (argumentos si hay, opcional){
        //contenido
        // }
        setContent {
            BasicNavigationAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BotonesNav(this)
                }
            }
        }
    }
}

/*
@Composable
fun botonSaludador(activity: Activity? = null){
    Button(onClick = {
        if (activity != null)
            Toast.makeText(activity,"HOLA OTRA VEZ!",Toast.LENGTH_SHORT).show()})
    {
        Text("soy el segundo boton fuera de scope")
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun pruebaInput(activity: Activity? = null){
    //estado - variables internats de un composable
    // que guardan info relevante a este elemento
    //evento - sucesos que contecen que pueden detonar un
    // "recompose" (por ejemplo, un cambio de estado)
    var nombre by remember { mutableStateOf("firulais")}
    Column {
        Text("El perrito se llama $nombre")
        TextField(value = nombre, onValueChange = {
            nombre = it
        })
    }
    Button(onClick = {Toast.makeText(activity,"Hola $nombre",Toast.LENGTH_SHORT).show()})
    {
        Text("Saludar a perrito")
    }
}

*/
// como definir un composable
// definimos una función con la anotacion @Composable

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
// hasta ahorita hemos definido todos los composables fuera de la clase
// la diferencia de una función dentro o fuera de na clase es cuestión de scope
// scope - alcance
*/
/*
@Composable
fun Ejemplo1(activity: Activity? = null){
    // como agregar varios composables en un solo composable, osea usar contenedores
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("OTRO TEXTO")
        Text( "Ejemplo1")
        Image(
            painter = painterResource(id = R.drawable.hiking),
            contentDescription = "a very cute puppy"
        )
        botonSaludador(activity)
        pruebaInput(activity)
    }
}
*/

@Composable
fun BotonesNav(activity: Activity? = null){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            Intent(activity,Hobbys::class.java).also {
                activity?.startActivity(it)
            }
        }) {
            Text(text = "Abrir Hobbys")
        }
        Button(onClick = {
            Intent(activity,Friends::class.java).also {
                activity?.startActivity(it)
            }
        }) {
            Text(text = "Abrir Amigos")
        }
    }
}

//podemos tener un preview que sirve para previsualizar
// nuestro trabajo
/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicNavigationAppTheme {
        Ejemplo1()
    }
}
*/