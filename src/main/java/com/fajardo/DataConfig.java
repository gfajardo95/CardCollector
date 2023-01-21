package com.fajardo;

import com.fajardo.data.CardData;
import com.fajardo.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    public CardData cardData() {
        List<Card> cards = new ArrayList<>();

        cards.add(new Card("1", "Charizard", "Evolution of Charmeleon.", "Art of fire-breathing charizard.", "Fire", new BattleStats(5, 10, 10, 100, null)));
        cards.add(new Card("2", "Fire", null, "Fire mana symbol.", "Fire", new ManaStats(1)));

        return new CardData(cards);
    }
}
