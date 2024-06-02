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
                "https://elcomercio.pe/resizer/nuaAco1N5oGOCsEamSgO2SXrhu0=/620x0/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/X7BBAPZO7VFSVFEKQFDSL7O4ZQ.jpg",
                "Una bebida caliente  "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://i.ytimg.com/vi/_1_RHqOMemQ/maxresdefault.jpg",
                " "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://i.ytimg.com/vi/_1_RHqOMemQ/maxresdefault.jpg",
                " "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://i.ytimg.com/vi/_1_RHqOMemQ/maxresdefault.jpg",
                " "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://i.ytimg.com/vi/_1_RHqOMemQ/maxresdefault.jpg",
                " "
            )
        )
        val imageAdapter = ImageAdapter()
        imageRVsecondario.adapter = imageAdapter
        imageAdapter.submitList(imageList)
    }

}

