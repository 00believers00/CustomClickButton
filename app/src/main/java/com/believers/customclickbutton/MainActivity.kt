package com.believers.customclickbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonTest.setBackgroundCustom(R.drawable.ic_bt_x,R.drawable.ic_bt_x_on)

    }
}
