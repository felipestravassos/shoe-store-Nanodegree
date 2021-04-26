package com.udacity.shoestore.ui.login

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.utils.SingleLiveEvent

class LoginViewModel : ViewModel() {

    val openWelcomeEvent: SingleLiveEvent<Void> = SingleLiveEvent()

    fun newUserOnClick() {
        openWelcomeEvent.postValue(null)
    }

    fun loginOnClick() {
        openWelcomeEvent.postValue(null)
    }

}