package com.saba.kotlin.domain

import android.util.Log

class RepositoryImpl : Repository {

    override fun logObject() {
        Log.e("repository", this.toString())
    }

}