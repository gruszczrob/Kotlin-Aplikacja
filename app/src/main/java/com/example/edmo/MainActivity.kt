package com.example.edmo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import com.example.edmo.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter: Int = 0;
    private var text="abcd";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var message  = Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT)
        binding.incrementBtn.setOnClickListener{
            message.cancel()
            var counter1 = counter;
            var change1 = binding.imputNumber.text.toString()
            var change = 1
            if(change1!=""){
                change = change1.toDouble().roundToInt();
            }
            counter = counter + change.toString().toInt()
            binding.counterValue.text = (counter).toString();
            message  = Toast.makeText(applicationContext, (counter1).toString()+" + "+ change +" = "+ binding.counterValue.text, Toast.LENGTH_SHORT)
            message.show()
        }
        binding.decrementBtn.setOnClickListener{
            message.cancel()
            var counter1 = counter;
            var change1 = binding.imputNumber.text.toString()
            var change = 1
            if(change1!=""){
                change = change1.toDouble().roundToInt();
            }
            counter = counter - change.toString().toInt()
            binding.counterValue.text = (counter).toString()
            message  = Toast.makeText(applicationContext, (counter1).toString()+" - "+ change +" = "+ binding.counterValue.text, Toast.LENGTH_SHORT)
            message.show()
        }
        binding.openSecondPage.setOnClickListener{
            var zdarzenie1 = Intent(this, chooseCalculatorActivity::class.java)
            startActivity(zdarzenie1)
        }

        binding.imputNumber.doAfterTextChanged {
            binding.incrementBtn.text = "+" + binding.imputNumber.text
            binding.decrementBtn.text = "-" + binding.imputNumber.text
        }
    }
}