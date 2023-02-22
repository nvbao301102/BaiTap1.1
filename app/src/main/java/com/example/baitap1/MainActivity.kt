package com.example.baitap1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview1 = findViewById<TextView>(R.id.textview1)
        val textview2 = findViewById<TextView>(R.id.textview2)
        val edittext1 = findViewById<EditText>(R.id.edittext1)
        val btnXuat = findViewById<Button>(R.id.btnXuat)

        btnXuat.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("data","${edittext1.text}")
            startActivity(intent)
        }




    }
}