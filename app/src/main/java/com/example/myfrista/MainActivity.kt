
package com.rashidcoder.kotlinand

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import com.rashidcoder.kotlinandroid.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_drawer.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }
    private  fun init (){
        val toggle = ActionBarDrawerToggle(Activity(),drawer_layout,toolbar,R.string.nav_open,R.string.nav_close)

    }
}