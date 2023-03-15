package com.akotsenko.firebaseexample.screens.login

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akotsenko.firebaseexample.service.FirebaseRepository
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    fun loginNewUser(email: String, password: String, context: Context) {
        viewModelScope.launch {
            FirebaseRepository().signInUser(email, password, context)
        }
    }

}