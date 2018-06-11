package com.example.administrator.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View.TEXT_ALIGNMENT_CENTER
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.button
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.sdk15.listeners.onClick
import org.jetbrains.anko.textView
import org.jetbrains.anko.toast


class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val tt3 = findViewById<TextView>(R.id.textView3)
        tt3.text = this.intent.getStringExtra("name1")

        linearLayout {

            setPadding(0, 100, 0, 0)
            orientation = LinearLayout.VERTICAL

            button("button by anko test") {
                onClick {
                    toast("你点击了<${this.text}>按钮!")
                }
            }

            textView(this@Main3Activity.intent.getStringExtra("name1")) {
                textAlignment = TEXT_ALIGNMENT_CENTER
            }

            button("qqq")


        }
        //var bundle =this.intent.extras
        //tt3.text=bundle.get("name").toString()

    }
}
