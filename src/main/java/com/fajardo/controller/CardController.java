package com.fajardo.controller;

import com.fajardo.data.CardData;
import com.fajardo.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CardController {

    @Autowired
    private CardData cardData;

    @QueryMapping
    public List<Card> cards() {
        return cardData.getCards();
    }
}
