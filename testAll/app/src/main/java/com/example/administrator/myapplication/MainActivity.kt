package com.example.administrator.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var bt1: Button//定义两个控件 lateinit 方法
    //private lateinit var tv1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        bt1 = findViewById(R.id.button1)
        val tv1 = findViewById<TextView>(R.id.textView2)
        val tv2 = findViewById(R.id.textView2) as TextView
        val tv3: TextView = findViewById(R.id.textView2)

        bt1.setOnClickListener {
            tv1.text = "到第二页。。"
            jump1()
        }
        tv2.setOnClickListener {
            tv3.text = "点击了自己！ "
        }

        val bt2 = findViewById<Button>(R.id.button2)
        bt2.setOnClickListener {

            startActivity(Intent(this, Main2Activity::class.java))
        }
    }


    private fun jump1() {
        //https://blog.csdn.net/MySuperGirl/article/details/72677423
        val intent = Intent()//获取intent对象
        intent.setClass(this, Main2Activity::class.java)// 获取class是使用::反射
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


}
