package com.example.tutorialspringboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.concurrent.ConcurrentHashMap

data class Customer(var id: Int = 0, var name: String= "")

@Service
class CustomerServiceImpl : CustomerService {
    @Value(value = "\${service.message.text}")
    private lateinit var text: String

    @Autowired
    lateinit var customers: ConcurrentHashMap<Int, Customer>

    override fun getCustomer(id: Int): ResponseEntity<Customer?> {
        println("$text getCustomer")
        val customer = customers[id]
        val status = if (customer == null) HttpStatus.NOT_FOUND else HttpStatus.OK
        return ResponseEntity(customer, status)
    }

    override fun getCustomers(): List<Customer> {
        return customers.map(Map.Entry<Int, Customer>::value).toList()
    }

    override fun createCustomer(customer: Customer): Customer? {
        customers[customer.id] = customer
        return customers[customer.id]
    }

    override fun deleteCustomer(id: Int): List<Customer> {
        customers.remove(id)
        return customers.map(Map.Entry<Int, Customer>::value).toList()
    }
}