package com.example.qr_ganerator_android_app


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class feature_list : AppCompatActivity() {

    private lateinit var iV_text_to_QR : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_list)


//        iV_text_to_QR = findViewById(R.id.iV_text_to_QR)
//        iV_text_to_QR.setOnClickListener {
//            Toast.makeText(this,"Enter Some Data", Toast.LENGTH_SHORT).show()
//        }


        iV_text_to_QR = findViewById(R.id.iV_text_to_QR)
        iV_text_to_QR.setOnClickListener {
            Toast.makeText(this,"Enter Some Data", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}