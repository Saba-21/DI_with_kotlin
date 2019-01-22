package com.saba.kotlin.presentation

import android.util.Log
import com.saba.kotlin.domain.Repository

class MainPresenter(private val repository: Repository, private val key: String) {

    fun callRepository() {
        repository.logObject()
    }

    fun logKeyValue() {
        Log.e("key", key)
    }

}