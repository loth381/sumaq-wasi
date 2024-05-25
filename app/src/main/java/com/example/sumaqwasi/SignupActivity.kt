package com.example.sumaqwasi

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sumaqwasi.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var  firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()


        binding.signupButton.setOnClickListener{

            val email = binding.signupEmail.text.toString()
            val  password = binding.signupPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                firebaseAuth.createUserWithEmailAndPassword(email, password)

                    .addOnCompleteListener(this) {task ->
                        if (task.isSuccessful) {
                            Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this, LoginActivity::class.java)
                            startActivity(intent)
                            finish()
                        }else {
                            Toast.makeText(this, "Signup Unsuccessful", Toast.LENGTH_SHORT).show()

                        }
                    }
            }else {
                Toast.makeText(this, "Enter email and Password", Toast.LENGTH_SHORT).show()

            }
        }
        binding.loginText.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}