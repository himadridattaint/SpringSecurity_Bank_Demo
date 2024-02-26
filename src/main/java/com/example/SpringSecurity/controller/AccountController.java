package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.model.Account;
import com.example.SpringSecurity.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController
{
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/myAccount")
    public Account getAccountDetails(@RequestParam Integer id)
    {
        Account account = accountRepository.findByCustomerId(id);
        if (account != null ) {
            return account;
        }else {
            return null;
        }
    }
}
