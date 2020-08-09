 package com.kebinr.eldado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun onClickLanzar(view: View) {
         val dado = Dado( 6)
         val dado2 = Dado( 6)
         val valorDado =dado.lanzar()
         val valorDado2 = dado2.lanzar()
         if (button.text.equals("LANZAR DADOS P2")){
             button.text = "LANZAR DADOS P1"
             val pla2: TextView = findViewById(R.id.Result2)
             val int =Integer.parseInt(Result2.text.toString())+ valorDado + valorDado2
             pla2.text = int.toString()
         }else{
             button.text = "LANZAR DADOS P2"
             val pla1: TextView = findViewById(R.id.Result1)
             val int =Integer.parseInt(Result1.text.toString()) +  valorDado + valorDado2
             pla1.text = int.toString()
         }
         when(valorDado){
             1->imageView.setImageResource(R.drawable.dice_1)
             2->imageView.setImageResource(R.drawable.dice_2)
             3->imageView.setImageResource(R.drawable.dice_3)
             4->imageView.setImageResource(R.drawable.dice_4)
             5->imageView.setImageResource(R.drawable.dice_5)
             6->imageView.setImageResource(R.drawable.dice_6)
         }
         when(valorDado2){
             1->imageView2.setImageResource(R.drawable.dice_1)
             2->imageView2.setImageResource(R.drawable.dice_2)
             3->imageView2.setImageResource(R.drawable.dice_3)
             4->imageView2.setImageResource(R.drawable.dice_4)
             5->imageView2.setImageResource(R.drawable.dice_5)
             6->imageView2.setImageResource(R.drawable.dice_6)
         }
     }
 }