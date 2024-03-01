package com.pmdm.dbimg.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pmdm.dbimg.R

class GaleriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)
    }

    fun volver(view: View) {
        finish()
    }
}