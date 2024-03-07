package mx.edu.potros.practica6

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class detalle_pelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val iv_pelicula_imagen: ImageView = findViewById(R.id.iv_pelicula_imagen)
        val NombreSeriePelicula: TextView = findViewById(R.id.NombreSeriePelicula)
        val tvserie_pelicula_Desc: TextView = findViewById(R.id.tvserie_pelicula_Desc)

        val tickect:Button=findViewById(R.id.buyTickets)
        val seats:TextView=findViewById(R.id.seatLeft)
        val boletos:String?=intent.getStringExtra("seats")

        Toast.makeText(this,"Boletos" +boletos,Toast.LENGTH_LONG).show()
        tickect.setOnClickListener {
            var intent:Intent=Intent(this, SeatSelection::class.java)
            startActivity(intent)
        }

        val bundle = intent.extras
        if (bundle != null) {
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            NombreSeriePelicula.text = bundle.getString("Titulo")
            tvserie_pelicula_Desc.text = bundle.getString("Sinopsis")
            seats.setText(boletos)
        }

    }
}