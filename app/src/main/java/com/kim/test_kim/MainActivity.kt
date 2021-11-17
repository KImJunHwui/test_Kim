package com.kim.test_kim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.internal.ContextUtils
import com.kim.test_kim.utility.utility
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    autoLoginCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->

        utility.setAutoLogin(this, isChecked)

}
       autoLoginCheckBox.isChecked = utility.getAutoLogin(this)

       }


        }

