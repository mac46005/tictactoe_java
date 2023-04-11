package com.preciado.tictactoe.models;

import com.preciado.utilities.console.mvvm.interfaces.IModel;

public class Player implements IModel<Integer> {
    private int id = 0;

    public Player() {

    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
