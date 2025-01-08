package com.example.firebase

import android.app.Application
import com.example.firebase.dependenciesinjection.AppContainer
import com.example.firebase.dependenciesinjection.MahasiswaContainer

class MahasiswaApplication : Application(){
    lateinit var container: AppContainer
    override fun onCrate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}