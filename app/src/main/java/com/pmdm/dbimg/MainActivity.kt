package com.pmdm.dbimg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pmdm.dbimg.activity.CamaraActivity
import com.pmdm.dbimg.activity.GaleriaActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToCamara(view: View) {
        val intent = Intent(this, CamaraActivity::class.java)
        startActivity(intent)
    }
    fun goToGaleria(view: View) {
        val intent = Intent(this, GaleriaActivity::class.java)
        startActivity(intent)
    }
}