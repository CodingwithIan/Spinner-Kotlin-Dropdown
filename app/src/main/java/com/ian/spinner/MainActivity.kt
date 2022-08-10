package com.ian.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.BoringLayout.make
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val schools=resources.getStringArray(R.array.schools)
        val spinner=findViewById<Spinner>(R.id.spinner)

        if (spinner !=null){
            val adapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,schools)
            spinner.adapter=adapter

            spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    TODO("Not yet implemented")
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }

        }
    }
}