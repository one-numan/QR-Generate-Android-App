package com.example.qr_ganerator_android_app


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class feature_list : AppCompatActivity() {

    private lateinit var iV_text_to_QR : ImageView
    private lateinit var iV_url_to_QR : ImageView

    private lateinit var iV_call_to_QR : ImageView
    private lateinit var iV_msg_to_QR : ImageView


    private lateinit var iV_wts_to_QR  : ImageView
    private lateinit var iV_upi_to_QR : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_list)


//        iV_text_to_QR = findViewById(R.id.iV_text_to_QR)
//        iV_text_to_QR.setOnClickListener {
//            Toast.makeText(this,"Enter Some Data", Toast.LENGTH_SHORT).show()
//        }

//        Button Functionalities
//        Btn 1 : iv_text_to_QR
        iV_text_to_QR = findViewById(R.id.iV_text_to_QR)
        iV_text_to_QR.setOnClickListener {
//            Toast.makeText(this,"Enter Some Data", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

//        Btn 2 : url_to_QR
        iV_url_to_QR = findViewById(R.id.iV_url_to_QR)
        iV_url_to_QR.setOnClickListener {
//            Toast.makeText(this,"URL TO QR", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Url_To_Qr::class.java)
            startActivity(intent)
        }


        //        Btn 3 : Message_to_QR
        iV_msg_to_QR = findViewById(R.id.iV_msg_to_QR)
        iV_msg_to_QR.setOnClickListener {
//            Toast.makeText(this,"Message TO QR", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Msg_to_qr::class.java)
            startActivity(intent)
        }

        //        Btn 4 : Call_to_QR
        iV_call_to_QR = findViewById(R.id.iV_call_to_QR)
        iV_call_to_QR.setOnClickListener {
//            Toast.makeText(this,"URL TO QR", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Call_to_qr::class.java)
            startActivity(intent)
        }
        //        Btn 5 : Whatsapp_to_QR
        iV_wts_to_QR = findViewById(R.id.iV_wts_to_QR)
        iV_wts_to_QR.setOnClickListener {
//            Toast.makeText(this,"URL TO QR", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Whataspp_to_QR::class.java)
            startActivity(intent)
        }
        //        Btn 6 : UPI_to_QR
        iV_upi_to_QR = findViewById(R.id.iV_upi_to_QR)
        iV_upi_to_QR.setOnClickListener {
//            Toast.makeText(this,"URL TO QR", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,UPI_to_qr::class.java)
            startActivity(intent)
        }

    }
}