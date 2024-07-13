package com.letschat

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn1 =
            findViewById<Button>(R.id.btnShowToast);
        btn1.setOnClickListener {
            //code
            Log.i("MainActivity", "Button was clicked !")

            Toast.makeText(this,"Button was clicked !", Toast.LENGTH_SHORT).show()
        }



    }
}
