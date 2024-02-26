package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.model.Transaction;
import com.example.SpringSecurity.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController
{
    @Autowired
    private TransactionRepository transactionRepository;
    @GetMapping("/myBalance")
    public List<Transaction> getBalanceDetails(@RequestParam Integer id)
    {
        List<Transaction> accountTransaction = transactionRepository.
                findByCustomerId(id);
        if (accountTransaction != null ) {
            return accountTransaction;
        }
        else
        {
            return null;
        }
    }
}
