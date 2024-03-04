package com.pmdm.dbimg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.FirebaseFirestore
import com.pmdm.dbimg.activity.CamaraActivity
import com.pmdm.dbimg.activity.GaleriaActivity
import com.pmdm.dbimg.activity.MostrarImagenActivity
import com.pmdm.dbimg.model.db.FirebaseDB
import com.pmdm.dbimg.model.entity.FirebaseDocument

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // firebase()
    }

    fun firebase() {
        println("START - Conexión con Firebase")
        val firebaseDB = FirebaseDB.getInstance()
        println("END - Conexión con Firebase")

        println("START - Inserción de datos en Firebase")
        val firebaseDocument = FirebaseDocument("1", hashMapOf(
            "image" to "Esta será la imagen 222222"
        ))

        firebaseDB.collection("imagenes").document(firebaseDocument.id).set(firebaseDocument.data)
        println("END - Inserción de datos en Firebase")

        println("START - Obtener datos de Firebase")
        firebaseDB.collection("imagenes").document(firebaseDocument.id).get().addOnSuccessListener {
            println("imagen: " + it.get("image"))
        }
        println("END - Obtener datos de Firebase")
    }

    fun goToCamara(view: View) {
        val intent = Intent(this, CamaraActivity::class.java)
        startActivity(intent)
    }
    fun goToGaleria(view: View) {
        val intent = Intent(this, GaleriaActivity::class.java)
        startActivity(intent)
    }

    fun goToMostrarImagen(view: View) {
        val intent = Intent(this, MostrarImagenActivity::class.java)
        startActivity(intent)
    }
}