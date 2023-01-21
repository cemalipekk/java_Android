package com.example.kotlingiris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var degiskenAdi = 5

        var d1 : Int = 45
        println(degiskenAdi)
        println(d1)

        var d2 : Float = 45.5f
        var d3 : Double = 45.6
        println(d2)
        println(d3)
    }
}