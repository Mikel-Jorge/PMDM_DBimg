package com.pmdm.dbimg.model.entity

data class FirebaseDocument(
    val id: String, // Supongamos que el ID del documento es una cadena
    val data: Map<String, Any> // Supongamos que los datos del documento son un mapa de pares clave-valor
)