package com.example.projet

import io.flic.lib.FlicButton

class MyButton(val roomNumber: Int, val flicButton: FlicButton) {
    fun getName(): String {
        return flicButton.name
    }
}