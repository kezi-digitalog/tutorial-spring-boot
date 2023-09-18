package com.example.tutorialspringboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class TutorialSpringBootApplication

@Controller
class FirstController() {
    @Autowired
    lateinit var service: ServiceInterface

    @RequestMapping(value = ["/user/{name}"], method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun hello(@PathVariable name: String) = service.getHello(name)
}

fun main(args: Array<String>) {
    runApplication<TutorialSpringBootApplication>(*args)
}
