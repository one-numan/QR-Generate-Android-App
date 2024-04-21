package com.all_qr_generator.qr_ganerator_android_app

import android.graphics.Bitmap
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.qrcode.QRCodeWriter

class Whataspp_to_QR : AppCompatActivity() {
    private lateinit var ivQRCode : ImageView
    private lateinit var etData : EditText
    private lateinit var btnGenerateQRcode : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whataspp_to_qr)
        ivQRCode = findViewById(R.id.iV_whatsapp_to_QR)
        etData = findViewById(R.id.editText_whatsapp_to_qr)
        btnGenerateQRcode = findViewById(R.id.btn_whatsapp_to_qr)
        btnGenerateQRcode.setOnClickListener{
            val data = etData.text.toString().trim()
            val datax="wa.me/+91$data"

            if(data.isEmpty()){
            }else{
                val writer = QRCodeWriter()
                try{
                    val bitMatrix = writer.encode(datax, BarcodeFormat.QR_CODE,512,512)
                    val width = bitMatrix.width
                    val height = bitMatrix.height
                    val bmp = Bitmap.createBitmap(width,height, Bitmap.Config.RGB_565)
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