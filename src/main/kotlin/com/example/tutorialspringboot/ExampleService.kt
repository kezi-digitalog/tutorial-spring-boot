package com.example.tutorialspringboot

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class ExampleService: ServiceInterface {
    // TODO:  error message "Error creating bean with name 'exampleService': Injection of autowired dependencies failed"
    @Value(value = "\${service.message.text}")
    private lateinit var text: String

    override fun getHello(name: String): String = "$text $name"
}