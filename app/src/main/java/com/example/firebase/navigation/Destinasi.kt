package com.example.firebase.navigation

interface HalamanController {
    val route : String
}

object DestinasiHome : HalamanController {
    override val route = "home"
}