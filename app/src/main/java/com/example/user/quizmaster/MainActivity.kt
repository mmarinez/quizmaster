package com.example.user.quizmaster

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTrue = findViewById<Button>(R.id.true_button)
        val buttonFalse = findViewById<Button>(R.id.false_button)

        buttonTrue.setOnClickListener {
            Toast.makeText(this@MainActivity, "Vamos a pasar en A", Toast.LENGTH_LONG).show()
        }

        buttonFalse.setOnClickListener {
            Toast.makeText(this@MainActivity, "C de Campeon", Toast.LENGTH_LONG).show()
        }
    }
}
