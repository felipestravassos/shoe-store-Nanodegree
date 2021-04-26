package com.udacity.shoestore.ui.main.welcome

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.utils.SingleLiveEvent

class WelcomeViewModel : ViewModel() {

    val openInstructionEvent: SingleLiveEvent<Void> = SingleLiveEvent()

    fun nextOnClick() {
        openInstructionEvent.postValue(null)
    }

}