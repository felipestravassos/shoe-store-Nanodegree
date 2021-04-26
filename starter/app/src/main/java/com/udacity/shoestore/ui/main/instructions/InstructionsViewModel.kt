package com.udacity.shoestore.ui.main.instructions

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.utils.SingleLiveEvent

class InstructionsViewModel : ViewModel() {

    val openStoreEvent: SingleLiveEvent<Void> = SingleLiveEvent()

    fun nextOnClick() {
        openStoreEvent.postValue(null)
    }

}