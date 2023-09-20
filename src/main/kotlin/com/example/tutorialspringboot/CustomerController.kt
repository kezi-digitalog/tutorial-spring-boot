package com.example.tutorialspringboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class CustomerController() {
    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping(value = ["/customer/{id}"])
    @ResponseBody
    fun getCustomer(
        @PathVariable id: Int
    ): ResponseEntity<Customer?> {
        return customerService.getCustomer(id)
    }

    @GetMapping(value = ["/customers"])
    @ResponseBody
    fun getCustomers(): List<Customer> {
        return customerService.getCustomers()
    }

    @PostMapping(value = ["/customer"])
    @ResponseBody
    fun createCustomer(
        @RequestBody customer: Customer
    ): Customer? {
        return customerService.createCustomer(customer)
    }

    @DeleteMapping(value = ["/customer/{id}"])
    @ResponseBody
    fun deleteCustomer(
        @PathVariable id: Int
    ): List<Customer> {
        return customerService.deleteCustomer(id)
    }
}

