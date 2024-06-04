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

class CulturaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cultura)

        val cultura = findViewById<RecyclerView>(R.id.cultura)


        val imageList = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                "",
                "Cultura"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://portal.andina.pe/EDPfotografia3/Thumbnail/2020/01/29/000648633W.jpg",
                "Festividades religiosas"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://s3-us-west-2.amazonaws.com/joinnus.com/user/582919/5baeacb93451f.jpg",
                "Arte popular"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://www.zamytours.com/img/fotos/danza/04.jpg",
                "Música y danzas "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://biblioteca.jornada.com.pe/images/2024/03/13/Gastronomia-ayacuchana-incrementara-su-demanda-en-Semana-Santa.jpeg",
                "Gastronomia"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://image.isu.pub/210720202639-491a76c79af914398cee9c438030eae0/jpg/page_1.jpg",
                "Arquitectura colonial"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://cdn.www.gob.pe/uploads/document/file/3158439/IMG-20220527-WA0320.jpg.jpg",
                "Lenguas y tradiciones"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://diariocorreo.pe/resizer/0XzXsVn7x4aP9w_oq9YxTAkbgME=/1200x675/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/YCWLHP47TVDLZM5LAIKQBNGUPI.jpg",
                "Sitios arqueológicos"
            )
        )

        val imageAdapter = ImageAdapter()
        cultura.adapter = imageAdapter
        imageAdapter.submitList(imageList)
    }

}