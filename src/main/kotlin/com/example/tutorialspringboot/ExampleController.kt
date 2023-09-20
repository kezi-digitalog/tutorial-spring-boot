package com.example.tutorialspringboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ConcurrentHashMap

@Controller
class ExampleController() {
    @Autowired
    lateinit var service: ServiceInterface

    @Autowired
    lateinit var customers: ConcurrentHashMap<Int, Customer>

    @RequestMapping(value = ["/user/{name}"], method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun hello(@PathVariable name: String): Customer? {
        println(service.getHello(name))
        return customers[4]
    }
}

data class Customer(var id: Int = 0, var name: String= "")