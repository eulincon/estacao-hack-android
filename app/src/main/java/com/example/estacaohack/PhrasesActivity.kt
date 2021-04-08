package com.example.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.estacaohack.databinding.ActivityMainBinding
import com.example.estacaohack.databinding.ActivityPhrasesBinding
import org.json.JSONArray
import org.json.JSONObject
import java.net.URL
import java.util.*

class PhrasesActivity : AppCompatActivity() {
    //Técnica utilizada para inicializar uma variável sem que ela seja nula
    private lateinit var binding: ActivityPhrasesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val list = arrayListOf("Genius is one percent inspiration and ninety-nine percent perspiration.\n -Thomas Edison",
            "You can observe a lot just by watching.\n -Yogi Berra",
            "A house divided against itself cannot stand.\n -Abraham Lincoln",
            "Difficulties increase the nearer we get to the goal.\n -Johann Wolfgang von Goethe",
            "Fate is in your hands and no one elses.\n -Byron Pulsifer",
            "Be the chief but never the lord.\n -Lao Tzu",
            "Nothing happens unless first we dream.\n -Carl Sandburg",
            "Well begun is half done.\n -Aristotle",
            "Life is a learning experience, only if you learn.\n -Yogi Berra",
            "Self-complacency is fatal to progress.\n -Margaret Sangster",
            "Peace comes from within. Do not seek it without.\n -Buddha",
            "What you give is what you get.\n -Byron Pulsifer",
            "We can only learn to love by loving.\n -Iris Murdoch"
        )
        binding = ActivityPhrasesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = list.random()

        binding.btnBack2.setOnClickListener{
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
            finish()
        }

        binding.btnNewPhrase.setOnClickListener{
            binding.textView.text = list.random()
        }
    }
}