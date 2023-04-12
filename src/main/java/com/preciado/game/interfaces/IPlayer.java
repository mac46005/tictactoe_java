package com.preciado.game.interfaces;

import com.preciado.utilities.console.mvvm.interfaces.IModel;

public interface IPlayer<T> extends IModel<T> {
    String getUsername();
    void setUsername(String username);
    IStats getPlayerStats();
    void setPlayerStats(IStats stats);
}
