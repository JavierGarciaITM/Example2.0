package com.example.myapplication80

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform