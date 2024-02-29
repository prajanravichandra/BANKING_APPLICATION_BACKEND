package com.bankingg.bankingg.service;

import com.bankingg.bankingg.model.Customer;
import com.bankingg.bankingg.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomersSorted(String field) {
        return customerRepository.findAll(Sort.by(field));
    }

    public List<Customer> getAllCustomersPaged(int offset, int size) {
        return customerRepository.findAll(PageRequest.of(offset, size)).getContent();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getCustomersByName(String name) {
        return customerRepository.findAllCustomersByName(name);
    }
}
