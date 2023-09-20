package com.example.tutorialspringboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JsonExampleController {
    @GetMapping(value = ["/json"])
    fun getJson() = SimpleObject()
}