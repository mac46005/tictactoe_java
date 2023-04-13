package com.preciado.utilities.console.mvc;

import com.preciado.utilities.console.mvc.interfaces.IConfiguration;

public class Configuration implements IConfiguration {
    private String controller;
    @Override
    public String getStartController() {
        return controller;
    }

    @Override
    public void setStartRoute(String controller) {
        this.controller = controller;
    }
}
