package com.fajardo.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BattleStats extends Stats {

    private int manaRequirement;
    private int attack;
    private int defense;
    private int hp;
    private List<Move> moves;
}
