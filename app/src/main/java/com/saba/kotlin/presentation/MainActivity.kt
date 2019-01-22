package com.saba.kotlin.presentation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.saba.kotlin.R
import com.saba.kotlin.consts.MAIN_PRESENTER
import com.saba.kotlin.consts.PER_ACTIVITY
import org.koin.android.ext.android.inject
import org.koin.android.scope.ext.android.bindScope
import org.koin.android.scope.ext.android.getOrCreateScope
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val presenter: MainPresenter by inject(MAIN_PRESENTER) { parametersOf("argument") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindScope(getOrCreateScope(PER_ACTIVITY))

        presenter.callRepository()

        presenter.logKeyValue()

    }

}
