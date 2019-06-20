package com.example.loginmvvm.viewmodel

import com.example.loginmvvm.model.User

class UserViewModel(
    val user: User
) {
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
        showToast(message)
    }
}