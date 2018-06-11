package com.example.administrator.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val bt = findViewById<Button>(R.id.button)
        val et1 = findViewById<EditText>(R.id.et1)
        val bt1 = findViewById<Button>(R.id.button1)

        val IT1 = Intent()

        bt.setOnClickListener {
            IT1.setClass(this, MainActivity::class.java)
            IT1.putExtra("name", et1.text.toString())//toString 不可省,否则不成功
            startActivity(IT1)
        }
        bt1.setOnClickListener {
            IT1.setClass(this, Main3Activity::class.java)
            IT1.putExtra("name1", et1.text.toString())

            // var bundle = Bundle()
            //bundle.putString("name1",et1.text.toString())
            // IT1.putExtras(bundle)

            startActivity(IT1)
        }
    }

}
