package com.example.tutorialspringboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class ExampleController() {
    @Autowired
    lateinit var service: ServiceInterface

    @RequestMapping(value = ["/user/{name}"], method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun hello(@PathVariable name: String): Example {
        println(service.getHello(name))
        return Example(123, "test")
    }
}

data class Example(var id: Int = 0, var name: String= "")