package com.example.tutorialspringboot

import org.springframework.http.ResponseEntity

interface CustomerService{
    fun getCustomer(id: Int) : ResponseEntity<Customer?>
    fun getCustomers() : List<Customer>
    fun createCustomer(customer: Customer) : Customer?
    fun deleteCustomer(id: Int) : List<Customer>
}