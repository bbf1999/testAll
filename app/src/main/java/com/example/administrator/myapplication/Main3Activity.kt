package com.example.administrator.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import org.jetbrains.anko.button
import org.jetbrains.anko.editText
import org.jetbrains.anko.relativeLayout
import org.jetbrains.anko.sdk15.listeners.onClick
import org.jetbrains.anko.toast


class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var tt3 = findViewById<TextView>(R.id.textView3)

        tt3.text = this.intent.getStringExtra("name1")
        relativeLayout {
            var name = editText()
            button("button by anko") {
                onClick {
                    toast("Hi,${name.text}!!")
                }
            }
        }
        //var bundle =this.intent.extras
        //tt3.text=bundle.get("name").toString()

    }
}
