package com.bank.account_service.service;

import com.bank.account_service.entity.Account;
import com.bank.account_service.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    public Account saveAccount(Account account) {
        return repository.save(account);
    }

    public List<Account> getAllAccounts() {
        return repository.findAll();
    }
}