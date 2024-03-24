package com.example.qr_ganerator_android_app

import android.graphics.Bitmap
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.qrcode.QRCodeWriter

class MainActivity : AppCompatActivity() {

    private lateinit var ivQRCode : ImageView
    private lateinit var etData : EditText
    private lateinit var btnGenerateQRcode : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivQRCode = findViewById(R.id.ivQRCode)
        etData = findViewById(R.id.etData)
        btnGenerateQRcode = findViewById(R.id.btnGenerateQRcode)
        btnGenerateQRcode.setOnClickListener{
            val data = etData.text.toString().trim()
            if(data.isEmpty()){
                Toast.makeText(this,"Enter Some Data",Toast.LENGTH_SHORT).show()
            }else{
                val writer = QRCodeWriter()
                try{
                    val bitMatrix = writer.encode(data,BarcodeFormat.QR_CODE,512,512)
                    val width = bitMatrix.width
                    val height = bitMatrix.height
                    val bmp = Bitmap.createBitmap(width,height,Bitmap.Config.RGB_565)
                    for (x in 0 until width ){
                        for (y in 0 until height){
                            bmp.setPixel(x,y,if (bitMatrix[x,y]) Color.BLACK else Color.WHITE)
                        }
                    }
                    ivQRCode.setImageBitmap(bmp)
                }catch(e: WriterException){
                    e.printStackTrace()
                }
            }
        }



    }
}