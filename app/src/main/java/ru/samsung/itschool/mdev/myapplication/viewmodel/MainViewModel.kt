package ru.samsung.itschool.mdev.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter = MutableLiveData<Int>()

    fun setValue() {
        counter.value = (counter.value ?: 0) + 1
    }
}