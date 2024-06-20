package com.example.jobsheet10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var namaEdit: EditText
    private lateinit var umurEdit: EditText
    private lateinit var sumbitBtn: Button

    private val NAME_KEY: String = "nama"
    private val AGE_KEY: String = "umur"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEdit = findViewById(R.id.namaEdit)
        umurEdit = findViewById(R.id.umurEdit)
        sumbitBtn = findViewById(R.id.sumbitBtn)

        sumbitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(AGE_KEY, umurEdit.text.toString())
            startActivity(intent)
        }
    }
}
