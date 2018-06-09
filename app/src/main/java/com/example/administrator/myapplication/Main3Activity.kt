package com.example.administrator.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var tt3 = findViewById<TextView>(R.id.textView3)

        tt3.text = this.intent.getStringExtra("name1")

        //var bundle =this.intent.extras
        //tt3.text=bundle.get("name").toString()

    }
}
