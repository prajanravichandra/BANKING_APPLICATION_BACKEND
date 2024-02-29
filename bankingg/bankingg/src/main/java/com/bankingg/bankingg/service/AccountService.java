package com.bankingg.bankingg.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingg.bankingg.model.Account;
import com.bankingg.bankingg.repository.AccountRepository;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
