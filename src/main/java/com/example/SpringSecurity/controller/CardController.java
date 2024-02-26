package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.model.Card;
import com.example.SpringSecurity.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController
{
    @Autowired
    private CardRepository cardRepository;
    @GetMapping("/myCard")
    public List<Card> getCardDetails(@RequestParam Integer id)
    {
        List<Card> card = cardRepository.findByCustomerId(id);
        if (card != null ) {
            return card;
        }else {
            return null;
        }
    }
}
