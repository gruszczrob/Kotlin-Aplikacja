package com.example.edmo

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edmo.databinding.ActivityBaseCalculatorBinding

class baseCalculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBaseCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var obliczenia:List<String> = listOf<String>()
        var liczba1Str = "0"
        binding.txtSolution.text=liczba1Str
        var liczba1 = 0.0
        var liczba2Str = "0"
        var liczba2 = 0.0
        var wynik=0.0
        var wynikStr=""

        binding.btnDecimal.setOnClickListener(){
            liczba1Str+="."
            binding.txtSolution.text=liczba1Str
        }
        binding.btnZero.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="0" else liczba1Str+="0"
            binding.txtSolution.text=liczba1Str
        }
        binding.btnOne.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="1" else liczba1Str+="1"
            binding.txtSolution.text=liczba1Str
        }
        binding.btnTwo.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="2" else liczba1Str+="2"
            binding.txtSolution.text=liczba1Str
        }
        binding.btnThree.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="3" else liczba1Str+="3"
            binding.txtSolution.text=liczba1Str
        }
        binding.btnFour.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="4" else liczba1Str+="4"
            binding.txtSolution.text=liczba1Str
        }
        binding.btnFive.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="5" else liczba1Str+="5"
            binding.txtSolution.text=liczba1Str
        }
        binding.btnSix.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="6" else liczba1Str+="6"
            binding.txtSolution.text=liczba1Str
        }
        binding.btnSeven.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="7" else liczba1Str+="7"
            binding.txtSolution.text=liczba1Str
        }
        binding.btnEight.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="8" else liczba1Str+="8"
            binding.txtSolution.text=liczba1Str
        }
        binding.btnNine.setOnClickListener(){
            if(liczba1Str=="0") liczba1Str="9" else liczba1Str+="9"
            binding.txtSolution.text=liczba1Str
        }

        binding.btnAdd.setOnClickListener(){
            binding.btnAdd.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnAdd.setTextColor(Color.BLACK);
            binding.btnDivide.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnDivide.setTextColor(Color.BLACK);
            binding.btnMultiply.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnMultiply.setTextColor(Color.BLACK);
            binding.btnSubtract.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnSubtract.setTextColor(Color.BLACK);
            binding.btnAdd.setBackgroundColor(Color.RED);
            binding.btnAdd.setTextColor(Color.WHITE);
            if(liczba1Str=="") {
                binding.txtSolution.text = "+";
                obliczenia=obliczenia.dropLast(1);
                obliczenia+="+";
            }else{
                obliczenia+=liczba1Str;
                obliczenia+="+";
                binding.txtSolution.text = "+";
                liczba1Str="";
            }
        }
        binding.btnSubtract.setOnClickListener(){
            binding.btnAdd.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnAdd.setTextColor(Color.BLACK);
            binding.btnDivide.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnDivide.setTextColor(Color.BLACK);
            binding.btnMultiply.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnMultiply.setTextColor(Color.BLACK);
            binding.btnSubtract.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnSubtract.setTextColor(Color.BLACK);
            binding.btnSubtract.setBackgroundColor(Color.RED);
            binding.btnSubtract.setTextColor(Color.WHITE);
            if(liczba1Str=="") {
                binding.txtSolution.text = "-";
                obliczenia=obliczenia.dropLast(1);
                obliczenia+="-";
            }else{
                obliczenia+=liczba1Str;
                obliczenia+="-";
                binding.txtSolution.text = "-";
                liczba1Str="";
            }
        }
        binding.btnMultiply.setOnClickListener(){
            binding.btnAdd.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnAdd.setTextColor(Color.BLACK);
            binding.btnDivide.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnDivide.setTextColor(Color.BLACK);
            binding.btnMultiply.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnMultiply.setTextColor(Color.BLACK);
            binding.btnSubtract.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnSubtract.setTextColor(Color.BLACK);
            binding.btnMultiply.setBackgroundColor(Color.RED);
            binding.btnMultiply.setTextColor(Color.WHITE);
            if(liczba1Str=="") {
                binding.txtSolution.text = "*";
                obliczenia=obliczenia.dropLast(1);
                obliczenia+="*";
            }else{
                obliczenia+=liczba1Str;
                obliczenia+="*";
                binding.txtSolution.text = "*";
                liczba1Str="";
            }
        }
        binding.btnDivide.setOnClickListener(){
            binding.btnAdd.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnAdd.setTextColor(Color.BLACK);
            binding.btnDivide.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnDivide.setTextColor(Color.BLACK);
            binding.btnMultiply.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnMultiply.setTextColor(Color.BLACK);
            binding.btnSubtract.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnSubtract.setTextColor(Color.BLACK);
            binding.btnDivide.setBackgroundColor(Color.RED);
            binding.btnDivide.setTextColor(Color.WHITE);
            if(liczba1Str=="") {
                binding.txtSolution.text = "/";
                obliczenia=obliczenia.dropLast(1);
                obliczenia+="/";
            }else{
                obliczenia+=liczba1Str;
                obliczenia+="/";
                binding.txtSolution.text = "/";
                liczba1Str="";
            }
        }
        binding.btnEquals.setOnClickListener(){
            obliczenia+=liczba1Str;
            var a=0;
            while (a<obliczenia.size) {
                if (a == 0) {
                    liczba1Str = obliczenia[a];
                    wynik = (liczba1Str).toDouble();
                    binding.txtSolution.text = wynik.toString();
                }
                else{
                    var b = a+1;
                    liczba2Str = obliczenia[b];
                    liczba2 = (liczba2Str).toDouble();
                    when(obliczenia[a]) {
                        "+" -> wynik = wynik + liczba2;
                        "-" -> wynik = wynik - liczba2;
                        "*" -> wynik = wynik * liczba2;
                        "/" -> if (liczba2 == (0).toDouble()) {
                            binding.txtSolution.text = "Błąd dzielenia przez 0";
                            wynik = (0).toDouble();
                        } else{
                            wynik = wynik / liczba2
                        }
                    }
                    a+=1;
                }
                a+=1;
            }
            binding.btnAdd.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnAdd.setTextColor(Color.BLACK);
            binding.btnDivide.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnDivide.setTextColor(Color.BLACK);
            binding.btnMultiply.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnMultiply.setTextColor(Color.BLACK);
            binding.btnSubtract.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnSubtract.setTextColor(Color.BLACK);
            liczba1Str="";
            liczba1=(0).toDouble();
            liczba2Str="";
            liczba2=(0).toDouble();
            obliczenia = listOf<String>()
            wynikStr=wynik.toString();
            binding.txtSolution.text = wynikStr;
            liczba1Str=wynikStr;

        }
        binding.btnBack.setOnClickListener(){
            if (liczba1Str=="0") {
                liczba1Str = "0";
            }else if (liczba1Str=="") {
                liczba1Str = "0";
            }else{
                liczba1Str=liczba1Str.dropLast(1);
            }
            if(liczba1Str=="") {
                liczba1Str = "0"
            }
            binding.txtSolution.text = liczba1Str;
        }
        binding.btnClear.setOnClickListener(){
            binding.btnAdd.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnAdd.setTextColor(Color.BLACK);
            binding.btnDivide.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnDivide.setTextColor(Color.BLACK);
            binding.btnMultiply.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnMultiply.setTextColor(Color.BLACK);
            binding.btnSubtract.setBackgroundColor(Color.rgb(206,206,206));
            binding.btnSubtract.setTextColor(Color.BLACK);
            wynik=(0).toDouble();
            liczba1Str="0";
            liczba1=(0).toDouble();
            liczba2Str="";
            liczba2=(0).toDouble();
            obliczenia = listOf<String>()
            binding.txtSolution.text = liczba1Str;
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
