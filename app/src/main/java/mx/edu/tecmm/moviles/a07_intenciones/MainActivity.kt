package mx.edu.tecmm.moviles.a07_intenciones

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnE =  findViewById<Button>(R.id.btnExplicita)

        btnE.setOnClickListener{
            val intent1 = Intent(this, SecundariaActividad::class.java)
            startActivity(intent1)
        }

        val btnIn =  findViewById<Button>(R.id.btnInformacion)

        btnIn.setOnClickListener{
            val intent2 = Intent(this, Presentacion::class.java)
            startActivity(intent2)
        }

        val btnI =  findViewById<Button>(R.id.btnImplicita)

        btnI.setOnClickListener{
            Log.e("Boton", "Se Presiono")
            val atienda = Intent(android.content.Intent.ACTION_VIEW)
            atienda.data = Uri.parse("https://www.google.com/")
            startActivity(atienda)
        }
    }
}