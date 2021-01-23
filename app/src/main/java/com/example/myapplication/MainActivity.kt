package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = Toast.makeText(applicationContext,"ห้าม username กับ passwordเหมือนกัน.",Toast.LENGTH_LONG)
        val b = Toast.makeText(applicationContext,"รหัสผ่านไม่ตรงกัน.",Toast.LENGTH_LONG)
        val c = Toast.makeText(applicationContext,"กรอกให้ครบทุกช่อง.",Toast.LENGTH_LONG)
        val d = Toast.makeText(applicationContext,"สมัครเสร็จสิ้น.",Toast.LENGTH_LONG)

        button1.setOnClickListener(){
            if (this.id.text.toString() == "" || this.pass.text.toString() == "" || this.con.text.toString() == ""){
            c.show()
        }
            else{
            if (this.id.text.toString() == this.pass.text.toString() || this.id.text.toString() == this.con.text.toString()||
            this.id.text.toString() == this.pass.text.toString() && this.id.text.toString() == this.con.text.toString()){
            a.show()
        }
            else
                if (this.pass.text.toString() == this.con.text.toString()){
            d.show()
        }
        else{
            b.show()
        }
        }
        }

        button2.setOnClickListener(){
            id.setText(null)
            pass.setText(null)
            con.setText(null)
        }
    }
}