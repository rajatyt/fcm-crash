package com.example.firebasecloudmesseging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val button:Button=findViewById<Button>(R.id.button)

		button.setOnClickListener {
			throw RuntimeException("Crash intentionally look at firebase now")
		}
	}
}