package com.srikandi.mymodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.srikandi.mymodule.screen.BookFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MymoduleActivity : AppCompatActivity(), HasAndroidInjector {
    @Inject
    lateinit var supportFragmentInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mymodule)

        addBookFragment()
    }

    override fun androidInjector() = supportFragmentInjector

    private fun addBookFragment() {
        supportFragmentManager.beginTransaction().apply {
            addToBackStack(BookFragment::class.java.simpleName)
            add(R.id.mymodule_activity_framelayout, BookFragment())
        }
    }
}