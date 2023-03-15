package com.akotsenko.firebaseexample.screens.start

import androidx.lifecycle.ViewModel
import com.akotsenko.firebaseexample.service.FirebaseRepository

class StartViewModel : ViewModel() {
    fun logOut() {
        FirebaseRepository().logOut()
    }
}