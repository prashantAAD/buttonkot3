package com.example.buttonkot3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt=findViewById<Button>(R.id.button2) as Button
        bt.setOnClickListener {
            Toast.makeText(this@MainActivity,"by using onClickListner",Toast.LENGTH_LONG).show()
        }
    }
    fun buttonFunc(v:View){
        if (v.id==R.id.button){
            Toast.makeText(this@MainActivity,"by using onClick in Xml",Toast.LENGTH_LONG).show()
        }
    }
}