package mx.edu.tecmm.moviles.a07_intenciones

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Presentacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentacion)

        val btnR =  findViewById<Button>(R.id.btnRegresar)

        btnR.setOnClickListener{
          finish()
        }
    }
}