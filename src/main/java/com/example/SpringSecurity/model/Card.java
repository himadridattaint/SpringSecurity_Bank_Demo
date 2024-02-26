package com.example.SpringSecurity.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Card
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "card_id")
    private Integer cardId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "amount_used")
    private Integer amountUsed;

    @Column(name = "available_amount")
    private Integer availableAmount;

}
