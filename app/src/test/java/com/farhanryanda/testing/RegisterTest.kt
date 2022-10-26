package com.farhanryanda.testing

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RegisterTest {

    private lateinit var register: Register

    @Before
    fun setUp(){
        register = Register()
    }

    @Test
    fun email_exist() {
        val result = register.validateRegisterInput("tr","farhan@gmail.com","123456","123456")
        assertEquals("email exist",result,false)
    }

    @Test
    fun name_exist() {
        val result = register.validateRegisterInput("farhan","s@s.com","123456","123456")
        assertEquals("email exist",result,false)
    }

    @Test
    fun email_empty() {
        val result = register.validateRegisterInput("br","","123456","123456")
        assertEquals("email empty",result,false)
    }

    @Test
    fun password_kurang() {
        val result = register.validateRegisterInput("br","","12345","12345")
        assertEquals("password < 6",result,false)
    }

    @Test
    fun password_lebih() {
        val result = register.validateRegisterInput("bt","","12345","123453121212121212121212121212121212121212121212121212121212123213231123")
        assertEquals("password > 50",result,false)
    }
}