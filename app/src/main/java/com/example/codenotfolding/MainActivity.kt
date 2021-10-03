package com.example.codenotfolding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.codenotfolding.ui.main.MainFragment
import com.example.codenotfolding.ui.main.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    override fun onStart() {
        super.onStart()

        viewModel.apply {
            liveData1.observe(this@MainActivity, {
                printToLog(it)
            })

            liveData2.observe(this@MainActivity, {
                printToLog(it)
            })
        }

        viewModel.liveData3.observe(this@MainActivity, {
            printToLog(it)
        })

    }

    private fun printToLog(word: String) {
        for (letter in word) {
            Log.d("MainActivity", "Word is: $word, letter is: $letter")
        }
    }
}