package com.example.tutorials

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.Collections.shuffle

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var lives = 3
        var life = findViewById<TextView>(R.id.life)
        life.text = lives.toString()
            var plus1 = findViewById<Button>(R.id.plus1)
            var plus2 = findViewById<Button>(R.id.plus2)
            var plus3 = findViewById<Button>(R.id.plus3)
            var plus4 = findViewById<Button>(R.id.plus4)
            var minus1 = findViewById<Button>(R.id.minus1)
            var minus2 = findViewById<Button>(R.id.minus2)
            var mul1 = findViewById<Button>(R.id.mul1)
            var mul2 = findViewById<Button>(R.id.mul2)
            var div1 = findViewById<Button>(R.id.div1)
            var div2 = findViewById<Button>(R.id.div2)
            //Above are changeable buttons
            var b1 = findViewById<Button>(R.id.b1)
            var b2 = findViewById<Button>(R.id.b2)
            var b3 = findViewById<Button>(R.id.b3)
            var b4 = findViewById<Button>(R.id.b4)
            var b5 = findViewById<Button>(R.id.b5)
            var b6 = findViewById<Button>(R.id.b6)
            var b7 = findViewById<Button>(R.id.b7)
            var b8 = findViewById<Button>(R.id.b8)
            var b9 = findViewById<Button>(R.id.b9)
            var b10 = findViewById<Button>(R.id.b10)
            var res_plus = findViewById<Button>(R.id.ans1)
            var res_minus = findViewById<Button>(R.id.ans2)
            var res_mul = findViewById<Button>(R.id.ans3)
            var res_div = findViewById<Button>(R.id.ans4)
            var res_plus2 = findViewById<Button>(R.id.ans5)
            var values = MutableList(10){ Random.nextInt(0, 101)}
            var ans_plus1 = values[0]
            var ans_plus2 = values[1]
            var ans_plus3 = values[2]
            var ans_plus4 = values[3]
            var ans_minus1 = Math.max(values[4], values[5])
            var ans_minus2 = Math.min(values[4], values[5])
            var ans_mul1 = values[6]
            var ans_mul2 = values[7]
            var ans_div1 = values[9]*values[8]
            var ans_div2 = values[8]
            var ANS_PLUS = ans_plus1 + ans_plus2
            var ANS_PLUS2 = ans_plus3 + ans_plus4
            var ANS_MINUS = Math.abs(ans_minus1 - ans_minus2)
            var ANS_MUL = ans_mul1*ans_mul2
            var ANS_DIV = values[9]
            res_plus.text = ANS_PLUS.toString()
            res_plus2.text = ANS_PLUS2.toString()
            res_minus.text = ANS_MINUS.toString()
            res_mul.text = ANS_MUL.toString()
            res_div.text = ANS_DIV.toString()
        values[9] = values[9]*values[8]
            shuffle(values)
            b1.text = values[0].toString()
            b2.text = values[1].toString()
            b3.text = values[2].toString()
            b4.text = values[3].toString()
            b5.text = values[4].toString()
            b6.text = values[5].toString()
            b7.text = values[6].toString()
            b8.text = values[7].toString()
            b9.text = values[8].toString()
            b10.text = values[9].toString()
            var selected = "0"
            b1.setOnClickListener {
                if(b1.text != "0"){
                    selected = b1.text as String
                    b1.text = "0"
                }
                else{
                    b1.text = selected.toString()
                    selected = "0"
                }
            }
            b2.setOnClickListener {
                if(b2.text != "0"){
                    selected = b2.text as String
                    b2.text = "0"
                }
                else{
                    b2.text = selected.toString()
                    selected = "0"
                }
            }
            b3.setOnClickListener {
                if(b3.text != "0"){
                    selected = b3.text as String
                    b3.text = "0"
                }
                else{
                    b3.text = selected.toString()
                    selected = "0"
                }
            }
            b4.setOnClickListener {
                if(b4.text != "0"){
                    selected = b4.text as String
                    b4.text = "0"
                }
                else{
                    b4.text = selected
                    selected = "0"
                }
            }
            b5.setOnClickListener {
                if(b5.text != "0"){
                    selected = b5.text as String
                    b5.text = "0"
                }
                else{
                    b5.text = selected.toString()
                    selected = "0"
                }
            }
            b6.setOnClickListener {
                if(b6.text != "0"){
                    selected = b6.text as String
                    b6.text = "0"
                }
                else{
                    b6.text = selected.toString()
                    selected = "0"
                }
            }
            b7.setOnClickListener {
                if(b7.text != "0"){
                    selected = b7.text as String
                    b7.text = "0"
                }
                else{
                    b7.text = selected.toString()
                    selected = "0"
                }
            }
            b8.setOnClickListener {
                if(b8.text != "0"){
                    selected = b8.text as String
                    b8.text = "0"
                }
                else{
                    b8.text = selected.toString()
                    selected = "0"
                }
            }
            b9.setOnClickListener {
                if(b9.text != "0"){
                    selected = b9.text as String
                    b9.text = "0"
                }
                else{
                    b9.text = selected.toString()
                    selected = "0"
                }
            }
            b10.setOnClickListener {
                if(b10.text != "0"){
                    selected = b10.text as String
                    b10.text = "0"
                }
                else{
                    b10.text = selected.toString()
                    selected = "0"
                }
            }
            plus1.setOnClickListener {
                if(selected != "0"){
                    plus1.text = selected
                    selected = "0"
                }
                else{
                    selected = plus1.text.toString()
                    plus1.text = "0"
                }
            }
            plus2.setOnClickListener {
                if(selected != "0"){
                    plus2.text = selected
                    selected = "0"
                }
                else{
                    selected = plus2.text.toString()
                    plus2.text = "0"
                }
            }
            plus3.setOnClickListener {
                if(selected != "0"){
                    plus3.text = selected
                    selected = "0"
                }
                else{
                    selected = plus3.text.toString()
                    plus3.text = "0"
                }
            }
            plus4.setOnClickListener {
                if(selected != "0"){
                    plus4.text = selected
                    selected = "0"
                }
                else{
                    selected = plus4.text.toString()
                    plus4.text = "0"
                }
            }
            minus1.setOnClickListener {
                if(selected != "0"){
                    minus1.text = selected
                    selected = "0"
                }
                else{
                    selected = minus1.text.toString()
                    minus1.text = ""
                }
            }
            minus2.setOnClickListener {
                if(selected != "0"){
                    minus2.text = selected
                    selected = Int.MIN_VALUE.toString()
                }
                else{
                    selected = minus2.text.toString()
                    minus2.text = "0"
                }
            }
            mul1.setOnClickListener {
                if(selected != "0"){
                    mul1.text = selected
                    selected = "0"
                }
                else{
                    selected = mul1.text.toString()
                    mul1.text = "0"
                }
            }
            mul2.setOnClickListener {
                if(selected != "0"){
                    mul2.text = selected
                    selected = "0"
                }
                else{
                    selected = mul2.text.toString()
                    mul2.text = "0"
                }
            }
            div1.setOnClickListener {
                if(selected != "0"){
                    div1.text = selected
                    selected = "0"
                }
                else{
                    selected = div1.text.toString()
                    div1.text = "0"
                }
            }
            div2.setOnClickListener {
                if(selected != "0"){
                    div2.text = selected
                    selected = "0"
                }
                else{
                    selected = div2.text.toString()
                    div2.text = "0"
                }
            }
        var score = findViewById<TextView>(R.id.score)
        score.text = "0"
        var result = plus1.text.toString().toInt() + plus2.text.toString().toInt() == res_plus.text.toString().toInt() && plus3.text.toString().toInt() + plus4.text.toString().toInt() == res_plus2.text.toString().toInt() && mul1.text.toString().toInt() * mul2.text.toString().toInt() == res_mul.text.toString().toInt() && minus1.text.toString().toInt() - minus2.text.toString().toInt() == res_minus.text.toString().toInt() && div1.text.toString().toInt() / div2.text.toString().toInt() == res_div.text.toString().toInt()
            var submit = findViewById<Button>(R.id.submit)
            submit.setOnClickListener {
                if(((plus1.text.toString().toInt() + plus2.text.toString()
                        .toInt()) == res_plus.text.toString().toInt()) &&
                    ((plus3.text.toString().toInt() + plus4.text.toString()
                        .toInt()) == res_plus2.text.toString().toInt()) &&
                    ((mul1.text.toString().toInt() * mul2.text.toString()
                        .toInt()) == res_mul.text.toString().toInt()) &&
                    ((minus1.text.toString().toInt() - minus2.text.toString()
                        .toInt()) == res_minus.text.toString().toInt()) &&
                    ((div1.text.toString().toInt() / div2.text.toString()
                        .toInt()) == res_div.text.toString().toInt())
                ){
                    values = MutableList(10){Random.nextInt(0, 101)}
                    ans_plus1 = values[0]
                    ans_plus2 = values[1]
                    ans_plus3 = values[2]
                    ans_plus4 = values[3]
                    ans_minus1 = Math.max(values[4], values[5])
                    ans_minus2 = Math.min(values[4], values[5])
                    ans_mul1 = values[6]
                    ans_mul2 = values[7]
                    ans_div1 = values[9]*values[8]
                    ans_div2 = values[8]
                    ANS_PLUS = ans_plus1 + ans_plus2
                    ANS_PLUS2 = ans_plus3 + ans_plus4
                    ANS_MINUS = Math.abs(ans_minus1 - ans_minus2)
                    ANS_MUL = ans_mul1*ans_mul2
                    ANS_DIV = values[9]
                    res_plus.text = ANS_PLUS.toString()
                    res_plus2.text = ANS_PLUS2.toString()
                    res_minus.text = ANS_MINUS.toString()
                    res_mul.text = ANS_MUL.toString()
                    res_div.text = ANS_DIV.toString()
                    values[9] = values[9]*values[8]
                    shuffle(values)
                    b1.text = values[0].toString()
                    b2.text = values[1].toString()
                    b3.text = values[2].toString()
                    b4.text = values[3].toString()
                    b5.text = values[4].toString()
                    b6.text = values[5].toString()
                    b7.text = values[6].toString()
                    b8.text = values[7].toString()
                    b9.text = values[8].toString()
                    b10.text = values[9].toString()
                    plus1.text = "0"
                    plus2.text = "0"
                    plus3.text = "0"
                    plus4.text = "0"
                    minus1.text = "0"
                    minus2.text = "0"
                    mul1.text = "0"
                    mul2.text = "0"
                    div1.text = "0"
                    div2.text = "-1"
                    score.text = (score.text.toString().toInt()+10).toString()
                }
                else{
                    if(lives > 0){
                        life.text = (life.text.toString().toInt()-1).toString()
                        lives--
                    }
                    else{
                        life.text = "GAME OVER"
                    }
                }
            }
        }
}