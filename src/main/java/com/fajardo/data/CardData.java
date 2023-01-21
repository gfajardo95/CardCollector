package com.fajardo.data;

import com.fajardo.model.Card;
import lombok.Data;

import java.util.List;

@Data
public class CardData {

    private List<Card> cards;

    public CardData(List<Card> cards) {
        this.cards = cards;
    }
}
