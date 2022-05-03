package com.asabil.simpleapptoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val buttonclick = findViewById<Button>(R.id.mainbutton);

        buttonclick.setOnClickListener{
            Toast.makeText(applicationContext, "This is a really simple app", Toast.LENGTH_LONG).show() //will not dipslay in the virutal machine but on physical device appears
            }
        }

      //  val layout:View! = layoutInflater.inflate(R.layout.custom_toast,layerToast)
    }

    //fun presenttoast(view: View) {}

