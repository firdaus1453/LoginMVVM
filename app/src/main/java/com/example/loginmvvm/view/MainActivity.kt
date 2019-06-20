package com.example.loginmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginmvvm.R
import com.example.loginmvvm.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var userViewModel:UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            userViewModel.updateModel(edtEmail.text.toString(),
                edtPassword.text.toString())
            userViewModel.validLogin()
        }
    }
}
