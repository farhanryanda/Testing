package com.farhanryanda.testing

class Register {

    private val existUser = listOf<String>("farhan","ryanda","imran","didi")
    private val existEmail = listOf<String>("farhan@gmail.com","ryanda@gmail.com","imran@gmail.com","didi@gmail.com")

    fun validateRegisterInput(
        name: String,
        email: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (name.isEmpty() || email.isEmpty() || password.isEmpty() ||confirmPassword.isEmpty()){
            return false
        }

        if (name in existUser) {
            return false
        }

        if (email in existEmail) {
            return false
        }

        if (password.length < 6) {
            false
        }

        if (password.length > 50) {
            false
        }
        if (password != confirmPassword){
            return false
        }

        return true
    }
}