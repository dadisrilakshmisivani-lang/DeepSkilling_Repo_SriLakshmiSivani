package com.bank.account_service.controller;

import com.bank.account_service.entity.Account;
import com.bank.account_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return service.saveAccount(account);
    }

    @GetMapping
    public List<Account> getAccounts() {
        return service.getAllAccounts();
    }
}