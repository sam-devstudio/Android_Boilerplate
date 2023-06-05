package com.agpubs.android_boilerplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // Customize the toolbar as needed
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("My Toolbar")

        //val navController = findNavController(this, R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration.Builder(
            setOf(
                R.id.action_home,
                R.id.action_settings
            )
        ).build()

        setupWithNavController(toolbar, navController, appBarConfiguration)
        setupWithNavController(bottomNavigation, navController)

    }
}