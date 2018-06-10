package com.example.administrator.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var bt1: Button//定义两个控件 lateinit 方法
    //private lateinit var tv1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        bt1 = findViewById(R.id.button1)
        val tv2 = findViewById<TextView>(R.id.textView2) //方法2
        val tv3: TextView = findViewById(R.id.textView3)//方法3

        tv2.setOnClickListener {
            tv2.text = "点击了自己！ "
            Toast.makeText(this, "点击了-self", Toast.LENGTH_SHORT).show()
        }

        val bt2 = findViewById<Button>(R.id.button2)
        bt2.setOnClickListener {
            startActivity(Intent(this, Main2Activity::class.java))
        }

        //接收intent的信息，重点为参数
        val info1 = intent.getStringExtra("name")
        if (info1.isNullOrEmpty().not()) {
            tv3.text = info1
        }

        //下面的浮动控件
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    fun click(v: View?) {
        when (v?.id) {
            R.id.button1 -> {
                //https://blog.csdn.net/MySuperGirl/article/details/72677423
                val intent = Intent()//获取intent对象
                intent.setClass(this, Main2Activity::class.java)// 获取class是使用::反射
                startActivity(intent)
            }
            R.id.button4 -> {
                Toast.makeText(this, "点击了button4", Toast.LENGTH_SHORT).show()
            }
            R.id.button3 -> {
                Toast.makeText(this, "点击了button3", Toast.LENGTH_SHORT).show()
            }
        }
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
