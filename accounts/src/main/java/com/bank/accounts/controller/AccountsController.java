package com.bank.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.accounts.model.Accounts;
import com.bank.accounts.model.Customer;
import com.bank.accounts.repository.AccountsRepository;

@RestController
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        return accountsRepository.findByCustomerId(customer.getCustomerId());
    }

}