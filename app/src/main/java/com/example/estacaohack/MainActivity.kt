package com.example.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.estacaohack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Técnica utilizada para inicializar uma variável sem que ela seja nula
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            //Aqui os dados digitados são capturados e salvos em variáveis
            val number = binding.inputNumber.text.toString().trim()
            var result = ""

            //Aqui é feita a validação dos campos
            if(number.isEmpty()){
                binding.inputNumber.error = "Preencha este campo"
                binding.inputNumber.requestFocus()
            }else{
                if(number.toInt() % 2 == 0) {
                    result = "Número par"
//                    Toast.makeText(this, "Número par", Toast.LENGTH_LONG).show()
                } else {
                    result = "Número ímpar"
//                    Toast.makeText(this, "Ímpar", Toast.LENGTH_LONG).show()
                }

                //E em seguida, a ResultActivity será aberta
                val mIntent = Intent(this, ResultActivity::class.java)
                mIntent.putExtra("NUMBER_RESULT", result)
                mIntent.putExtra("NUMBER_INPUTED", number)
                startActivity(mIntent)
                finish()
            }
        }

        binding.btnPhrases.setOnClickListener{
            val mIntent = Intent(this, PhrasesActivity::class.java)
            startActivity(mIntent)
            finish()
        }
    }
}