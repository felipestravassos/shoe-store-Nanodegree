package com.udacity.shoestore.ui.main.shoelist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.utils.SingleLiveEvent

class ShoeListViewModel : ViewModel() {

    val openDetailEvent: SingleLiveEvent<Void> = SingleLiveEvent()
    val shoesLiveData: MutableLiveData<ArrayList<Shoe>> = MutableLiveData()

    init {
        loadShoes()
    }

    fun addOnClicked() {
        openDetailEvent.call();
    }

    private fun loadShoes() {
        val shoes: ArrayList<Shoe> = arrayListOf()
        shoes.add(Shoe("Shoe A", 9.5, "Company A", "This is a description", listOf<String>()))
        shoes.add(Shoe("Shoe B", 8.5, "Company A", "This is a description", listOf<String>()))
        shoes.add(Shoe("Shoe C", 10.0, "Company A", "This is a description", listOf<String>()))
        shoes.add(Shoe("Shoe D", 9.5, "Company A", "This is a description", listOf<String>()))
        shoesLiveData.postValue(shoes)
    }
}