package diana.padilla.poodiana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val nombre: String = "Diana"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dia: String
        var edad: Int = 17
        var velocidad: Double
        var temperatura: Float = 30.9f

        val numeroPI: Double = 3.141592
        val DUI: String = "12345678-9"
        val fechaNacimiento: String = "01 de Julio del 2006"

        var telefono: Int? = null

        val objCalculadora = Calculadora()
        println(objCalculadora.sumar(2, 4))

        val listado = arrayOf("Leche", "pan", 23, "harina")
    }

    class Animales{

    }
}