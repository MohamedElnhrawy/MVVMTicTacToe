package com.example.mohamedelnhrawy.tictactoe.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableArrayMap;

import com.example.mohamedelnhrawy.tictactoe.model.Cell;
import com.example.mohamedelnhrawy.tictactoe.model.Game;
import com.example.mohamedelnhrawy.tictactoe.model.Player;

import static com.example.mohamedelnhrawy.tictactoe.utils.StringUtility.stringFromNumbers;

/**
 * Created by mohamedelnhrawy on 9/28/18.
 */

public class GameViewModel extends ViewModel {

    public ObservableArrayMap<String, String> cells;
    private Game game;

    public void init(String player1, String player2) {
        game = new Game(player1, player2);
        cells = new ObservableArrayMap<>();
    }

    public void onClickedCellAt(int row, int column) {
        if (game.cells != null) {
        if (game.cells[row][column] == null) {
            game.cells[row][column] = new Cell(game.currentPlayer);
            cells.put(stringFromNumbers(row, column), game.currentPlayer.value);
            if (game.hasGameEnded())
                game.reset();
            else
                game.switchPlayer();
        }
    }
    }

    public LiveData<Player> getWinner() {
        return game.winner;
    }
}
