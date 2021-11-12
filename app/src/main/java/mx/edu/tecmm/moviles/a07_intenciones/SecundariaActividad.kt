package mx.edu.tecmm.moviles.a07_intenciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecundariaActividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secundaria_actividad)

        val btnCerrar =  findViewById<Button>(R.id.btnCerrar)
        btnCerrar.setOnClickListener{
            finish()
        }
    }
}