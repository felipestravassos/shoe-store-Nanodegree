package com.udacity.shoestore.ui.main.shoedetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.utils.SingleLiveEvent

class ShoeDetailViewModel : ViewModel() {

    val shoe: MutableLiveData<Shoe> = MutableLiveData()
    val closePage: SingleLiveEvent<Void> = SingleLiveEvent()

    init {
        shoe.postValue(Shoe("Shoe A", 9.5, "Company A", "This is a description", listOf()))
    }

    fun onSaveClicked() {
        closePage.call()
    }

    fun onCancelClicked() {
        closePage.call()
    }
}