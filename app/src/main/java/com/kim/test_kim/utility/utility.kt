package com.kim.test_kim.utility

import android.content.Context

class utility {

    companion object{

        private val prefName = "TestPref"

        private val AUTO_LOGIN = "AUTO_LOGIN"

        fun setAutoLogin( context : Context, autoLogin : Boolean ){

            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(AUTO_LOGIN, autoLogin).apply()

        }
    }


}