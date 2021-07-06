package com.example.userdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.userdetail.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //everything outside of class is property
    //lateinit means the variable is not assigned when declared
    //var is variable, val is value
    //val btn : Double
    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("Ali", "123456", "ali@gmail.com", "123 Jalan ABC")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //binding longer time to load but react faster than find view by id
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson

        /*binding.tvName.text = aPerson.name
        binding.tvEmail.text = aPerson.email
        binding.tvAddress.text = aPerson.address
        binding.tvIC.text = aPerson.ic*/

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "xyz@gmail.com"

            binding.apply { invalidateAll() }


        }


    }
}