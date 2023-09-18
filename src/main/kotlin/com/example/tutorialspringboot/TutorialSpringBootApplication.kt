package com.example.tutorialspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class TutorialSpringBootApplication

@Controller
class FirstController {
    @RequestMapping(value = ["/user"], method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun hello() = "hello world"
}

fun main(args: Array<String>) {
    runApplication<TutorialSpringBootApplication>(*args)
}
