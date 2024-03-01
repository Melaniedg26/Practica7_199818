package mx.edu.potros.practica6

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detalle_pelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val iv_pelicula_imagen: ImageView = findViewById(R.id.iv_pelicula_imagen)
        val NombreSeriePelicula: TextView = findViewById(R.id.NombreSeriePelicula)
        val tvserie_pelicula_Desc: TextView = findViewById(R.id.tvserie_pelicula_Desc)

        val bundle = intent.extras
        if (bundle != null) {
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            NombreSeriePelicula.text = bundle.getString("Titulo")
            tvserie_pelicula_Desc.text = bundle.getString("Sinopsis")
        }


    }
}