package com.example.guicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buNumberEvent(view: View){

        val buSelect = view as Button
        var btnClickedValue: String = numberInput.text.toString()
        when(buSelect.id){
            btn0.id -> {
                btnClickedValue += "0"
            }
            btn1.id -> {
                btnClickedValue += "1"
            }
            btn2.id -> {
                btnClickedValue += "2"
            }
            btn3.id -> {
                btnClickedValue += "3"
            }
            btn4.id -> {
                btnClickedValue += "4"
            }
            btn5.id -> {
                btnClickedValue += "5"
            }
            btn6.id -> {
                btnClickedValue += "6"
            }
            btn7.id -> {
                btnClickedValue += "7"
            }
            btn8.id -> {
                btnClickedValue += "8"
            }
            btn9.id -> {
                btnClickedValue += "9"
            }
            btnDot.id -> {
                btnClickedValue += "."
            }

        }
        numberInput.setText(btnClickedValue)



    }

}