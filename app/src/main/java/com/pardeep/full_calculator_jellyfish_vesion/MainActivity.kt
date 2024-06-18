package com.pardeep.full_calculator_jellyfish_vesion

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pardeep.full_calculator_jellyfish_vesion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // binding
    var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        // all _clear button
        binding?.acButton?.setOnClickListener{
            binding?.textView2?.setText("")
        }
        // open bracket button
        binding?.openBracket?.setOnClickListener{
            binding?.textView2?.append("(")
        }
        // close_braket button
        binding?.closeBracket?.setOnClickListener{
            binding?.textView2?.append(")")
        }
        // divide button
        binding?.divide?.setOnClickListener {
            binding?.textView2?.append("/")
        }
        //seven number btn
        binding?.btn7?.setOnClickListener {
            binding?.textView2?.append("7")
        }
        //eight button
        binding?.btn8?.setOnClickListener {
            binding?.textView2?.append("8")
        }
        //nine btn
        binding?.btn9?.setOnClickListener {
            binding?.textView2?.append("9")
        }
        // multiply button
        binding?.btnMul?.setOnClickListener {
            binding?.textView2?.append("*")
        }
        //four btn
        binding?.btn4?.setOnClickListener {
            binding?.textView2?.append("4")
        }
        // five btn
        binding?.btn5?.setOnClickListener {
            binding?.textView2?.append("5")
        }
        //six btn
        binding?.btn6?.setOnClickListener {
            binding?.textView2?.append("6")
        }
        //minus btn
        binding?.btnSubs?.setOnClickListener {
            binding?.textView2?.append("-")
        }
        // one btn
        binding?.btn1?.setOnClickListener {
            binding?.textView2?.append("1")
        }
        // two button
        binding?.btn2?.setOnClickListener {
            binding?.textView2?.append("2")
        }
        //three button
        binding?.btn3?.setOnClickListener {
            binding?.textView2?.append("3")
        }
        // add button
        binding?.btnAdd?.setOnClickListener {
            binding?.textView2?.append("+")
        }
        //clear button
        binding?.btnClear?.setOnClickListener {
            binding?.textView2?.setText("0")
        }
        //zero button
        binding?.btn0?.setOnClickListener {
            binding?.textView2?.append("0")
        }
        //dot button
        binding?.btnDot?.setOnClickListener {
            binding?.textView2?.append(".")
        }
        // equal button
        binding?.btnEqual?.setOnClickListener {

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}