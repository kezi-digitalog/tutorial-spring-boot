package com.example.tutorialspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class TutorialSpringBootApplication

@Controller
class FirstController(val exampleService: ExampleService) {
    @RequestMapping(value = ["/user/{name}"], method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun hello(@PathVariable name: String) = exampleService.getHello(name)
}

fun main(args: Array<String>) {
    runApplication<TutorialSpringBootApplication>(*args)
}
