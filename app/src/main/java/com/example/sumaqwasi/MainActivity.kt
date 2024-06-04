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

        val culturaImageView: ImageView = findViewById(R.id.cultura)
        culturaImageView.setOnClickListener {
            val intent = Intent(this, CulturaActivity::class.java)
            startActivity(intent)
        }

        val imageRV = findViewById<RecyclerView>(R.id.imageRV)


        val imageList = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.fjau2-1.fna.fbcdn.net/v/t39.30808-6/444457768_853888170119893_8632883622852049924_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeEf4l0jCkVMKwYPP4CULpsEA8CHeeDxWJgDwId54PFYmLLSA6M6mwL_ssqM906K8NfjLZZiSWzhT2pjyGR587IU&_nc_ohc=0x5rCyDEkAMQ7kNvgHFIa4X&_nc_ht=scontent.fjau2-1.fna&oh=00_AYAQMeKiZDyr8CbFV9O5WfxUchq1P8TSMVitEdMOgc0zuw&oe=66640589",
                ""
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.fjau2-1.fna.fbcdn.net/v/t39.30808-6/444944754_849763653865678_2593587532044052769_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeFw9YjnPmbNTAlGCyYYZE9a_ht2qkFX3sj-G3aqQVfeyLp5yqg4cHjy4XrCcb61xMjoLJyrQkVvNwPUYuVZ7qml&_nc_ohc=23Kgd2iitIkQ7kNvgFG7N02&_nc_ht=scontent.fjau2-1.fna&oh=00_AYCbitXS07wVfGjl4syYtbJbfGInRj2j5V5PNc-Y-aiGjQ&oe=666417E0",
                ""
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.fjau2-1.fna.fbcdn.net/v/t39.30808-6/441527215_848958907279486_3359042217618276399_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeEQ-CLORdP7TF09n66Y_iNw9jj2DtFm4nb2OPYO0WbidtkUdWKUh5Ipl3Yk8bFd60z-xGWhVMBobC6i1wP2zs_C&_nc_ohc=3MPFLoG840YQ7kNvgHz2YL6&_nc_ht=scontent.fjau2-1.fna&oh=00_AYAWSMmWtDp9tEpjtrdx6fspR0Y85-k2mXX6HZ4_mrGk4w&oe=666405AD",
                " "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.fjau2-1.fna.fbcdn.net/v/t39.30808-6/442418749_846704700838240_8549007749831246232_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeGR33KiR83IG-OiM2W7D3uEtpOqJsFoDAy2k6omwWgMDHNqX9rU9OsDyY_CQvQdX1N7x2-aJrfMsH2nz3VAgk_f&_nc_ohc=QlfDdu0wGkkQ7kNvgE695zT&_nc_ht=scontent.fjau2-1.fna&oh=00_AYCnCr4Es4Tyw7Jpndgp_ufKk-YobWgvw2omhAh7bkfJdg&oe=6663EEF5",
                " "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.fjau2-1.fna.fbcdn.net/v/t39.30808-6/441493758_844576434384400_985816515092415058_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeH2Vlk6O0-3DPac5JcYKXu8h_8xc79cEKaH_zFzv1wQpgVWDGSYoLq7PnabgkN4qGRGxH3RNV_Eyt2otC8jGu2O&_nc_ohc=Ut7rk2z6DqYQ7kNvgFVMaZd&_nc_ht=scontent.fjau2-1.fna&oh=00_AYBRF-xPcZPsbte3uqlzRLmqIM26R2fwTn4CH7B-5LDhUg&oe=666415F9",
                " "
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://scontent.fjau2-1.fna.fbcdn.net/v/t39.30808-6/442409218_843282687847108_2480788594314794477_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeHj78W7KRsOobYWTWIz7Rb041xGVfwhwX_jXEZV_CHBf4e3blXQNVeqKvbilAPfv5bzcNzliWT-0KWSzv0hLobB&_nc_ohc=DP2KFNyREUwQ7kNvgGFL_q9&_nc_ht=scontent.fjau2-1.fna&oh=00_AYCdPoWwHFFky-iRhcKStsMyU1gDmgcNKz7kNa_8eTBMmA&oe=6663F61F",
                " "
            )
        )

        val imageAdapter = ImageAdapter()
        imageRV.adapter = imageAdapter
        imageAdapter.submitList(imageList)

    }
}