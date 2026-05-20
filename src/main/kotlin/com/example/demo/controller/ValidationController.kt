package com.example.demo.controller

import com.example.demo.model.RequestModel
import com.example.demo.service.ValidationService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class ValidationController (private val service: ValidationService) {
    @PostMapping("/validate")
    fun validate(@RequestBody request: RequestModel): Map <String, String>{
        val result = service.validate(request.value1, request.value2)

        return if(result){
            mapOf("status" to "success")
        }else{
            mapOf("status" to "error")
        }
    }
}