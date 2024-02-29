package com.bankingg.bankingg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingg.bankingg.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> 
{
}
