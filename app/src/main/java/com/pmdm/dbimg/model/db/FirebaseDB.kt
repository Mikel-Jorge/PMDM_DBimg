package com.pmdm.dbimg.model.db

import com.google.firebase.firestore.FirebaseFirestore

class FirebaseDB {
    companion object {
        @Volatile
        private var INSTANCE: FirebaseFirestore? = null

        fun getInstance(): FirebaseFirestore {
            synchronized(this) {
                if(INSTANCE == null)
                    INSTANCE = FirebaseFirestore.getInstance()
                return INSTANCE as FirebaseFirestore
            }
        }
    }
}