package com.example.pc1_23_09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.NotificationCompat.MessagingStyle.Message
import androidx.core.text.toHtml

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etParcial: EditText = findViewById(R.id.etparcial)
        val etFinal: EditText = findViewById(R.id.etFinal)
        val etPep: EditText = findViewById(R.id.etpep)
        val btnCalcular: Button = findViewById(R.id.btncalcular)
        btnCalcular.setOnClickListener {
            this.sendTotal(etParcial.text.toString(),etFinal.text.toString(), etPep.text.toString())
        }
    }
    private fun sendTotal(message: String, message: String, message: ){
        val intent = Intent(this, Result::class.java)
        intent.putExtra("param", message)
    }
}