package com.bankingg.bankingg.controller;

import com.bankingg.bankingg.model.Customer;
import com.bankingg.bankingg.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getcust/sort/{field}")
    public ResponseEntity<List<Customer>> getAllCustomersSorted(@PathVariable String field) {
        List<Customer> customers = customerService.getAllCustomersSorted(field);
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/getcust/paged/{offset}/{size}")
    public ResponseEntity<List<Customer>> getAllCustomersPaged(
            @PathVariable int offset,
            @PathVariable int size
    ) {
        List<Customer> customers = customerService.getAllCustomersPaged(offset, size);
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @PostMapping("/postcus")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/getcust/name/{name}")
    public ResponseEntity<List<Customer>> getCustomersByName(@PathVariable String name) {
        List<Customer> customers = customerService.getCustomersByName(name);
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}
