package com.example.sumaqwasi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.sumaqwasi.Adpaters.ImageAdapter
import com.example.sumaqwasi.Model.ImageItem
import java.util.UUID

class ComidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida)

        val comida = findViewById<RecyclerView>(R.id.comida)


        val imageList = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                "",
                "Lugares"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://huancaraylla.com.pe/wp-content/uploads/2022/05/Full-day-City-Tour-en-Ayacucho-Peru1-800x600-1.jpg",
                "Plaza Mayor"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://ayacuchoperu.net/uploads/large/catedral-santa-maria-ayacucho-peru.jpg",
                "Catedral"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://upload.wikimedia.org/wikipedia/commons/9/91/Iglesia_de_Santo_Domingo_en_Huamanga.jpg",
                "templo de santo"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://upload.wikimedia.org/wikipedia/commons/4/4a/Edificio_ANFASEP.jpg",
                "museo de la memoria "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://cdn.www.gob.pe/uploads/document/file/3510212/standard_0.jpeg.jpeg",
                "Wari"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://huancaraylla.com.pe/wp-content/uploads/2022/05/Pampa-de-Ayacucho.jpg",
                "Pampa de Ayacucho "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://www.tierrasvivas.com/img/vilcashuaman-the-great-inca-complex-of-ayacucho-457.jpg",
                "Vilcashuamán"
            )
        )

        val imageAdapter = ImageAdapter()
        comida.adapter = imageAdapter
        imageAdapter.submitList(imageList)
    }
    }
