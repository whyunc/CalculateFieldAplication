package com.example.calculatefieldaplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSquare: Button = findViewById(R.id.btnSquare)
        val btnRectangle: Button = findViewById(R.id.btnRectangle)
        val btnTriangle: Button = findViewById(R.id.btnTriangle)
        val btnRound: Button = findViewById(R.id.btnRound)

        btnSquare.setOnClickListener(this)
        btnRectangle.setOnClickListener(this)
        btnTriangle.setOnClickListener(this)
        btnRound.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnSquare -> {
                val moveSquare = Intent(this@MainActivity, squareActivity::class.java)
                startActivity(moveSquare)
            }
            R.id.btnRectangle -> {
                val moveRectangle = Intent(this@MainActivity, rectangleActivity::class.java)
                startActivity(moveRectangle)
            }
            R.id.btnTriangle -> {
                val moveTriangle = Intent(this@MainActivity, triangleActivity::class.java)
                startActivity(moveTriangle)
            }
            R.id.btnRound -> {
                val moveRound = Intent(this@MainActivity, roundAcitivity::class.java)
                startActivity(moveRound)
            }
        }
    }
}