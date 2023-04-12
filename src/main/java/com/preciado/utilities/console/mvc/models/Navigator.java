package com.preciado.utilities.console.mvc.models;

import com.preciado.utilities.console.mvc.interfaces.INavigator;

public abstract class Navigator implements INavigator {

    protected Object data;
    protected Event onNavigateTo = new Event(this, data);

}
