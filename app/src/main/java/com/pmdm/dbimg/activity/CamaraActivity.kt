package com.pmdm.dbimg.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pmdm.dbimg.R

class CamaraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camara)

    }

    fun volver(view: View) {
        finish()
    }
}