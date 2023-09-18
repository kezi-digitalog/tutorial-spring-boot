package com.example.tutorialspringboot

import org.springframework.stereotype.Service

@Service
class ExampleService {
    fun getHello(name: String) = "hello $name"
}