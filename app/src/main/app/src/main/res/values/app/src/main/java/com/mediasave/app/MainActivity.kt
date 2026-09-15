package com.mediasave.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "MediaSave"
        text.textSize = 30f
        text.gravity = 17

        setContentView(text)
    }
}
