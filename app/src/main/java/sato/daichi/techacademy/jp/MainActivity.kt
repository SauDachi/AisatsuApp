package sato.daichi.techacademy.jp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View){
        showTimePickerDialog()
    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                //2:00 ~ 9:59
                if (hour >= 2 && hour < 10) {
                    textView.text = "おはよう"
                }
                //10:00 ~ 17:59
                else if (hour >= 10 && hour < 18) {
                    textView.text = "こんにちは"
                }
                //18:00 ~ 1:59
                else {
                    textView.text = "こんばんは"
                }
            },
            //初期値12時0分　24時間表記
            12, 0, true)
        timePickerDialog.show()
    }
}
