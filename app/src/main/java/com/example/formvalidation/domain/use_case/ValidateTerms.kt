package com.example.formvalidation.domain.use_case

class ValidateTerms {
    fun execute(validateAccepted:Boolean):ValidationResult{
        if (!validateAccepted){
            return ValidationResult(
                successful = false,
                errorMessage = "you should accept the terms dumbass"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}