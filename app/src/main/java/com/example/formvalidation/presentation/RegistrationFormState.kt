package com.example.formvalidation.presentation

import android.provider.ContactsContract.CommonDataKinds.Email

data class RegistrationFormState(
    val email: String = "",
     val emailError:String? = null,
     val password: String = "",
    val passwordError:String? = null,
    val repeatedPassword:String = "",
    val repeatedPasswordError:String? =null,
    val acceptedTerms : Boolean = false,
    val termsError: String? = null
)
