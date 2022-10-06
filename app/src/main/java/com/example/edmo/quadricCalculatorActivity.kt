package com.example.edmo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edmo.databinding.ActivityQuadricCalculatorBinding
import kotlin.math.round

class quadricCalculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuadricCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuadricCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.inputA.setText("0");
        binding.inputB.setText("0");
        binding.inputC.setText("0");
        binding.inputX.setText("0");


        binding.submit.setOnClickListener{
            var a=0.0;
            var b=0.0;
            var c=0.0;
            var x=0.0;
            if(binding.inputA.text.toString()=="") binding.inputA.setText("0");
            if(binding.inputB.text.toString()=="") binding.inputB.setText("0");
            if(binding.inputC.text.toString()=="") binding.inputC.setText("0");
            if(binding.inputX.text.toString()=="") binding.inputX.setText("0");


            a = binding.inputA.text.toString().toDouble();
            b = binding.inputB.text.toString().toDouble();
            c = binding.inputC.text.toString().toDouble();
            x = binding.inputX.text.toString().toDouble();
            var wynik = (a*x*x)+(b*x)+c;
            binding.result.text = wynik.toString();
        }
        binding.prviousBtn.setOnClickListener() {
            var zdarzenie1 = Intent(this, chooseCalculatorActivity::class.java)
            startActivity(zdarzenie1)
        }
        binding.mainBtn.setOnClickListener() {
            var zdarzenie1 = Intent(this, MainActivity::class.java)
            startActivity(zdarzenie1)
        }
    }
}