package com.pmdm.dbimg.activity

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.widget.ImageView
import com.pmdm.dbimg.R
import com.pmdm.dbimg.model.db.FirebaseDB
import org.json.JSONException
import org.json.JSONObject

class MostrarImagenActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_imagen)
        imageView = findViewById<ImageView>(R.id.mi_image_view)

        val firebaseDB = FirebaseDB.getInstance()
        firebaseDB.collection("imagenes").document("1").get().addOnSuccessListener {
            mostrarImagen(it.get("image").toString())
        }
    }

    fun mostrarImagen(base64Image: String) {
        try {
            // Decodificar la cadena Base64 en un array de bytes
            val decodedBytes = Base64.decode(base64Image, Base64.DEFAULT)

            // Convertir el array de bytes a un Bitmap
            val bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)

            // Mostrar el Bitmap en un ImageView
            imageView.setImageBitmap(bitmap)
        } catch (e: JSONException) {
            e.printStackTrace()
            // Manejar cualquier error que pueda ocurrir al parsear la cadena JSON
        }
    }
}