package com.example.codenotfolding.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val liveData1 = MutableLiveData<String>().apply { value = "John" }
    val liveData2 = MutableLiveData<String>().apply { value = "Sue" }
    val liveData3 = MutableLiveData<String>().apply { value = "Pete" }

}