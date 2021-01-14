package com.example.calculatefieldaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class triangleActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var inAlas: EditText
    private lateinit var inTinggi: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        inAlas = findViewById(R.id.inAlas)
        inTinggi = findViewById(R.id.inTinggi)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val inputAlas = inAlas.text.toString().trim()
        val inputTinggi = inTinggi.text.toString().trim()

        var isEmptyFields = false
        when {
            inputAlas.isEmpty() -> {
                isEmptyFields = true
                inAlas.error = "Data tidak boleh kosong"
            }
            inputTinggi.isEmpty() -> {
                isEmptyFields = true
                inTinggi.error = "Data tidak boleh kosong"
            }
        }
        if (!isEmptyFields) {
            val luas = inputAlas.toDouble()*inputTinggi.toDouble()/2
            tvResult.text = luas.toString()
        }
    }
}