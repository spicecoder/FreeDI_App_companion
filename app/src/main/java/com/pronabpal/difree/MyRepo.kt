package com.pronabpal.difree

import android.app.Application

class MyRepo (
        private val application: Application

) {

    var aJson : String ="{'repository':'hello free DI'} "

    fun getJSON():String = application.packageName +" :"  + aJson

}