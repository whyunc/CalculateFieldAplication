package com.example.calculatefieldaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class rectangleActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var inPanjang: EditText
    private lateinit var inLebar: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        inPanjang = findViewById(R.id.inPanjang)
        inLebar = findViewById(R.id.inLebar)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val inputPanjang = inPanjang.text.toString().trim()
        val inputLebar = inLebar.text.toString().trim()

        var isEmptyFields = false

        when {
            inputPanjang.isEmpty() -> {
                isEmptyFields = true
                inPanjang.error = "Data ini tidak boleh kosong"
            }
            inputLebar.isEmpty() -> {
                isEmptyFields = true
                inLebar.error = "Data ini tidak boleh kosong"
            }
        }

        if (!isEmptyFields) {
            var luas = inputPanjang.toDouble()*inputLebar.toDouble()
            tvResult.text = luas.toString()
        }
    }
}