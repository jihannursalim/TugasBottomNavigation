package com.zfuncode.chaptertiga_.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasimplemennav.*
import com.example.tugasimplemennav.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var btnNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fcGojek, HomeFragment())
            .commit()

        binding.bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.menuHome ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcGojek, HomeFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menuChat -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcGojek, ChatFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menuPromo -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcGojek, PromoFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menuProfile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcGojek, ProfileFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}