package com.fajardo.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Card {

    private String id;
    private String title;
    private String lore;
    private String art;
    private String type;
    private Stats stats;
}
