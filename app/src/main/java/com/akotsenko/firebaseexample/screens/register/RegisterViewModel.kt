package com.akotsenko.firebaseexample.screens.register

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akotsenko.firebaseexample.service.FirebaseRepository
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {
    fun registerNewUser(email: String, password: String, context: Context) {
        viewModelScope.launch {
            FirebaseRepository().createUser(email, password, context)
        }
    }
}