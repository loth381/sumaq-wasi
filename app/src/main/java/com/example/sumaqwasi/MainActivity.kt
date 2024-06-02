package com.example.sumaqwasi

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.sumaqwasi.Adpaters.ImageAdapter
import com.example.sumaqwasi.Model.ImageItem
import com.example.sumaqwasi.databinding.ActivityMainBinding
import java.util.UUID

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


        val comidaImageView: ImageView = findViewById(R.id.comida)
        comidaImageView.setOnClickListener {
            val intent = Intent(this, ComidaActivity::class.java)
            startActivity(intent)
        }

        val imageRV = findViewById<RecyclerView>(R.id.imageRV)


        val imageList = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/866/500/500.jpg?hmac=FOptChXpmOmfR5SpiL2pp74Yadf1T_bRhBF1wJZa9hg",
                ""
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/270/500/500.jpg?hmac=MK7XNrBrZ73QsthvGaAkiNoTl65ZDlUhEO-6fnd-ZnY",
                ""
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/320/500/500.jpg?hmac=2iE7TIF9kIqQOHrIUPOJx2wP1CJewQIZBeMLIRrm74s",
                " "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/798/500/500.jpg?hmac=Bmzk6g3m8sUiEVHfJWBscr2DUg8Vd2QhN7igHBXLLfo",
                " "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/95/500/500.jpg?hmac=0aldBQ7cQN5D_qyamlSP5j51o-Og4gRxSq4AYvnKk2U",
                " "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/778/500/500.jpg?hmac=jZLZ6WV_OGRxAIIYPk7vGRabcAGAILzxVxhqSH9uLas",
                " "
            )
        )

        val imageAdapter = ImageAdapter()
        imageRV.adapter = imageAdapter
        imageAdapter.submitList(imageList)

    }
}