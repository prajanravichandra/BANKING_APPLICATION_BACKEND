package com.bankingg.bankingg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingg.bankingg.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long>
{

}
