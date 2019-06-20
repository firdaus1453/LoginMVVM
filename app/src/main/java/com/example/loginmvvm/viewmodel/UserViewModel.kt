package com.example.loginmvvm.viewmodel

import android.content.Context
import android.widget.Toast
import com.example.loginmvvm.model.User

class UserViewModel(val context:Context){

    val user:User = User("","")

    fun updateModel(email: String, password: String) {
        user.email = email
        user.password = password
    }

    private val TOAST_MESSAGE_SUCCESS = "Login Success"
    private val TOAST_MESSAGE_FAILED = "Login Failed"

    fun validLogin() {
        var isValid = true

        if (user.email.isNullOrEmpty()) isValid = false

        if (user.password.isNullOrEmpty()) isValid = false

        if (isValid) showToast(TOAST_MESSAGE_SUCCESS) else showToast(TOAST_MESSAGE_FAILED)
    }

    private fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}
}