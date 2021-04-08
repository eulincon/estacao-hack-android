package com.example.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.estacaohack.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    //Técnica utilizada para inicializar uma variável sem que ela seja nula
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numberResult = intent.getStringExtra("NUMBER_RESULT")
        val numberInputed = intent.getStringExtra("NUMBER_INPUTED")

        binding.textView2.text = numberResult
        binding.numberInputed.text = numberInputed

        binding.btnBack.setOnClickListener{
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
            finish()
        }

    }
}