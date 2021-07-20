package com.ipvc.estg.smartcity_aplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        //classe
    }


    //evento butão login
    //fazer validações

    fun buttonlogin(view: View) {

    }

    fun buttonnotas(view: View) {

        val intent = Intent(this, notaspessoais::class.java).apply {

        }

        startActivity(intent)

    }

    fun sairapp(view: View) {
        finishAffinity()
        System.exit(0)
    }


}