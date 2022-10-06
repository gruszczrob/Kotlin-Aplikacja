package com.example.edmo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edmo.databinding.ActivityChooseCalculatorBinding


class chooseCalculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChooseCalculatorBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.prviousBtn.setOnClickListener{
            var zdarzenie1 = Intent(this, MainActivity::class.java)
            startActivity(zdarzenie1)
        }
        binding.mainBtn.setOnClickListener{
            var zdarzenie1 = Intent(this, MainActivity::class.java)
            startActivity(zdarzenie1)
        }
        binding.baseBtn.setOnClickListener{
            var zdarzenie1 = Intent(this, baseCalculatorActivity::class.java)
            startActivity(zdarzenie1)
        }
        binding.quadricBtn.setOnClickListener{
            var zdarzenie1 = Intent(this, quadricCalculatorActivity::class.java)
            startActivity(zdarzenie1)
        }
    }
}