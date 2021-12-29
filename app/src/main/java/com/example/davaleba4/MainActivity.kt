package com.example.davaleba4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView =findViewById<BottomNavigationView>(R.id.bottomNavMenu)
        val controller = findNavController(R.id.nav_graph)

        var appBarConfiguration = AppBarConfiguration(
            setOf(
                R.layout.question_fragment,
                R.layout.answer_fragment

            )


        )
        setupActionBarWithNavController(controller, appBarConfiguration)
        bottomNavigationView.setupWithNavController(controller)
    }
}