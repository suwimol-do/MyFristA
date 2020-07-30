
package com.rashidcoder.kotlinand

import android.app.Activity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.example.myfrista.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_drawer.*

class MainActivity : AppCompatActivity() ,NavigationView.OnNavigationItemSelectedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        init()
    }
    private  fun init (){
        val toggle = ActionBarDrawerToggle(Activity(),drawer_layout,toolbar,R.string.nav_open,R.string.nav_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        navigation_view.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.item1 -> {
                  message.text = item.title
            }
            R.id.item2 ->{
                message.text = item.title

            }else->{

            }

        }
        drawer_layout.closeDrawer(GravityCompat.START)
      return true}
}