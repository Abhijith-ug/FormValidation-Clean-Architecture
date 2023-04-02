package com.example.formvalidation.domain.use_case

data class ValidationResult(
    val successful:Boolean,
    var errorMessage: String? = null,

)
