package com.designpattern.dpattern.behavioral.mediator


import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormViewModel : ViewModel() {

    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    val isFormValid = MediatorLiveData<Boolean>().apply {
        addSource(username) { validateForm() }
        addSource(password) { validateForm() }
    }

    private fun validateForm() {
        val valid = !username.value.isNullOrEmpty() && !password.value.isNullOrEmpty()
        isFormValid.value = valid
    }
}



//------------------------------------------------------------------------------------------------//
/**
 * 🧩 How It Works (Mediator in Form Validation)
 *
 * 1. Username and Password act as independent inputs (colleagues)
 *    → They are unaware of each other.
 *
 * 2. isFormValid acts as the Mediator
 *    → Observes changes from both inputs.
 *
 * 3. On any input change
 *    → Mediator recomputes the overall form validity
 *    → Notifies observers (e.g., enables/disables Submit button)
 *
 *
 * 📚 Real-World Examples in Android
 *
 * • Jetpack Components
 *   → MediatorLiveData combines multiple LiveData sources
 *   → ViewModel + LiveData follow mediator-like coordination
 *
 * • RxJava / RxKotlin
 *   → combineLatest() merges multiple streams and emits updates
 *
 * • Navigation Component
 *   → NavController acts as a mediator between fragments,
 *     ensuring they remain loosely coupled
 */
//------------------------------------------------------------------------------------------------//