package com.example.constraintlayoutscrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculator.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        btnAdd.setOnClickListener {
            var firstNumber = editFirstNum.text.toString()
            var secondNumber = editSecondNum.text.toString()
            if (TextUtils.isEmpty(firstNumber)) {
                editFirstNum.setError("Require!")
                return@setOnClickListener
            }
            if (TextUtils.isEmpty(secondNumber)) {
                editFirstNum.setError("Require!")
                return@setOnClickListener
            }

            var a: Int = firstNumber.toInt()
            var b: Int = secondNumber.toInt()
            var addResult: Int = a + b
            tvResult.text = addResult.toString()
        }

        btnSubtract.setOnClickListener {
            var firstNumber = editFirstNum.text.toString()
            var secondNumber = editSecondNum.text.toString()

            if (editFirstNum.text.isEmpty() && editSecondNum.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Enter Your Number!", Toast.LENGTH_LONG)
                    .show()
            } else {
                var a: Int = firstNumber.toInt()
                var b: Int = secondNumber.toInt()
                var addResult: Int = a - b
                tvResult.text = addResult.toString()
            }
        }

        btnMultiply.setOnClickListener {
            var firstNumber = editFirstNum.text.toString()
            var secondNumber = editSecondNum.text.toString()

            if (editFirstNum.text.isEmpty() && editSecondNum.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Enter Your Number!", Toast.LENGTH_LONG)
                    .show()
            } else {
                var a: Int = firstNumber.toInt()
                var b: Int = secondNumber.toInt()
                var addResult: Int = a * b
                tvResult.text = addResult.toString()
            }
        }

        btnDivision.setOnClickListener {
            var firstNumber = editFirstNum.text.toString()
            var secondNumber = editSecondNum.text.toString()

            if (editFirstNum.text.isEmpty() && editSecondNum.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Enter Your Number!", Toast.LENGTH_LONG)
                    .show()
            } else {
                var a: Double = firstNumber.toDouble()
                var b: Double = secondNumber.toDouble()
                var addResult: Double = a / b
                tvResult.text = addResult.toString()
            }
        }

        btnClear.setOnClickListener {
            editFirstNum.setText("")
            editSecondNum.setText("")
            tvResult.setText("=")
        }
    }
}
