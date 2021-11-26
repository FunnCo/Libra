package com.funnco.libra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.funnco.toasty.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.show("test", this)
    }
}