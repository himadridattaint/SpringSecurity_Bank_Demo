package com.example.SpringSecurity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction
{
    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name="account_number")
    private Long accountNumber;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getTransactionAmt() {
        return transactionAmt;
    }

    public void setTransactionAmt(Integer transactionAmt) {
        this.transactionAmt = transactionAmt;
    }

    public Integer getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(Integer closingBalance) {
        this.closingBalance = closingBalance;
    }

    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "transaction_amt")
    private Integer transactionAmt;

    @Column(name = "closing_balance")
    private Integer closingBalance;

}
