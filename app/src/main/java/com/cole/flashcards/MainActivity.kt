package com.cole.flashcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView

    private lateinit var flip1: Button
    private lateinit var flip2: Button
    private lateinit var flip3: Button

    private var trueFlip = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1 = findViewById(R.id.cat)
        textView2 = findViewById(R.id.country)
        textView3 = findViewById(R.id.textView)

        flip1 = findViewById(R.id.flip1)
        flip2 = findViewById(R.id.flip2)
        flip3 = findViewById(R.id.flip3)

        flip1.setOnClickListener {
            onFlip1()
        }

        flip2.setOnClickListener {
            onFlip2()
        }

        flip3.setOnClickListener {
            onFlip3()
        }

    }


        private fun onFlip1() {
            trueFlip = !trueFlip
            if (trueFlip) {
                textView1.text = getString(R.string.what_is_the_name_of_my_cat)
            } else {
                textView1.text = getString(R.string.cat_name)
            }

        }

    private fun onFlip3() {
        trueFlip = !trueFlip
        if(trueFlip) {
            textView2.text = getString(R.string.what_country_are_we_in)
        } else {
            textView2.text = getString(R.string.country_answer)
        }
    }

    private fun onFlip2() {
        trueFlip = !trueFlip
        if(trueFlip) {
            textView3.text = getString(R.string.what_is_the_best_browser)
        } else {
            textView3.text = getString(R.string.browser_answer)
        }
    }
}



