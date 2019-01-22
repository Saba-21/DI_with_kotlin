package com.saba.kotlin.app

import android.widget.Toast
import com.saba.kotlin.consts.MAIN_PRESENTER
import com.saba.kotlin.consts.PER_ACTIVITY
import com.saba.kotlin.consts.REPOSITORY
import com.saba.kotlin.domain.Repository
import com.saba.kotlin.domain.RepositoryImpl
import com.saba.kotlin.presentation.MainPresenter
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

object AppModules {

    val appModule = module(PER_ACTIVITY) {

        factory<Repository>(REPOSITORY) {

            Toast.makeText(androidContext(), "injected", Toast.LENGTH_SHORT).show()

            RepositoryImpl()
        }

        factory(MAIN_PRESENTER) { (key: String) -> MainPresenter(get(REPOSITORY), key) }

    }

}