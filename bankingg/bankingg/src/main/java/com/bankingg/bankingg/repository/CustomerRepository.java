package com.bankingg.bankingg.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bankingg.bankingg.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

      @Query("SELECT c FROM Customer c WHERE c.name = :name")
    List<Customer> findAllCustomersByName(@Param("name") String name);
}
