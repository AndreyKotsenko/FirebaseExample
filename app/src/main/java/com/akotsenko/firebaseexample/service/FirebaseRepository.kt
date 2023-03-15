package com.akotsenko.firebaseexample.service

import android.content.Context
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class FirebaseRepository {
    private val auth = FirebaseAuth.getInstance()

    fun createUser(email: String, password: String, context: Context) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(context, "OK!!!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, it.exception.toString(), Toast.LENGTH_SHORT).show()
                }
            }
    }

    fun signInUser(email: String, password: String, context: Context) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(context, "OK!!!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, it.exception.toString(), Toast.LENGTH_SHORT).show()
                }
            }
    }

    fun logOut() {
        auth.signOut()
    }
}