package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class ValidationService {
    private val validUsers = listOf("superuser","adminuser","demouser","guestuser")
    private val validEncPwd = listOf("aabc123","pwd456","demo789","guest1010")
    fun validate(value1: String, value2: String): Boolean{
        return validUsers.contains(value1) && validEncPwd.contains(value2)
    }
}