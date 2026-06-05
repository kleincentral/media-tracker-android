package edu.metrostate.ics342.mediatracker.ui.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.metrostate.ics342.mediatracker.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {
    private val _displayName = MutableStateFlow(value = "")
    val displayname = _displayName.asStateFlow()

    fun setDisplayName(newValue: String) {
        _displayName.value = newValue
    }

    fun onSignupClicked(){

    }
}
