package com.pronabpal.difree

import android.app.Application
class MyFreeDI : Application() {


    override fun onCreate() {
        super.onCreate()
        setEnv(this)
    }


    companion object {
         lateinit var  hdb: MyRepo
          fun  setEnv (app:Application) {
            hdb = MyRepo(app)

        }
    }
}