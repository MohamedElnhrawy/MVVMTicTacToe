package com.example.mohamedelnhrawy.tictactoe.model;

import com.example.mohamedelnhrawy.tictactoe.utils.StringUtility;

/**
 * Created by mohamedelnhrawy on 9/28/18.
 */

public class Cell {
    Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty(){
        return player == null || StringUtility.isNullOrEmpty(player.value);
    }
}
