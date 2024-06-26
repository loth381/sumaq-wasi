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

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageRVsecondario = findViewById<RecyclerView>(R.id.imageRVsecondario)


        val imageList = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                "",
                "Comidas tipicas"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://peru.info/archivos/publicacion/57-imagen-112263012019.jpg",
                "Puca Picante"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://iberculturaviva.org/wp-content/uploads/2022/01/ida1.jpeg",
                "Qapchi"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://www.zamytours.com/img/fotos/comida/01.JPG",
                "Mondongo"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://www.machupicchu.com.pe/wp-content/uploads/2023/08/chicharron-1024x536.jpg",
                "Chicharrón "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://comopreparar.pe/wp-content/uploads/2024/03/receta-de-cuy-chactado-arequipeno.jpg",
                "Cuy Chactado"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://i.pinimg.com/736x/f7/d8/c0/f7d8c042c4db289734ea8973e1f1ef9a.jpg",
                "Adobo"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Mondongo_o_patasca.jpg/1200px-Mondongo_o_patasca.jpg",
                "Patasca"
            )
        )

        val imageAdapter = ImageAdapter()
        imageRVsecondario.adapter = imageAdapter
        imageAdapter.submitList(imageList)
    }

}

