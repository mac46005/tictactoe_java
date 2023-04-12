package com.preciado.utilities.console.mvc;

import com.preciado.IApp;
import com.preciado.utilities.console.mvc.interfaces.IController;

import java.util.List;

public class App implements IApp {
    Router router;

    public App(Router router) {
        this.router = router;
    }

    @Override
    public void run(String[] args) {
        while(true){

        }
    }
}
