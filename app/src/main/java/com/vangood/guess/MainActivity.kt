package com.vangood.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.vangood.guess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //get view
        //val num = binding.edNum.text.toString().toFloat()

    }

    var ans = (1..10).random()
    fun choose(view: View){

        val num =binding.edNum.text.toString().toInt()
        if (num == ans){
           AlertDialog.Builder(this)
               .setMessage(num.toString())
               .setTitle("WIN! start a new round")
               .setPositiveButton("OK",null)
               .show()
            ans = (1..10).random()

        }else {
            //Log.d("Try again is not number",num.toString())
            Toast.makeText(this,"Fail! is not $num",Toast.LENGTH_LONG).show();
        }

    }

}