package com.srikandi.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.srikandi.R
import com.srikandi.screen.login.LoginFragment
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class AppActivity : AppCompatActivity(), HasAndroidInjector {
    @Inject
    lateinit var supportFragmentInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addLoginFragment()
    }

    override fun androidInjector() = supportFragmentInjector

    private fun addLoginFragment() {
        supportFragmentManager.beginTransaction().apply {
            addToBackStack(LoginFragment::class.java.simpleName)
            add(R.id.app_activity_framelayout, LoginFragment())
        }
    }
}