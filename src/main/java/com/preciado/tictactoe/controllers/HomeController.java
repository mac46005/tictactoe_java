package com.preciado.tictactoe.controllers;

import com.preciado.utilities.console.mvc.interfaces.IController;
import com.preciado.utilities.console.mvc.models.ViewResult;

public class HomeController implements IController {
    public ViewResult Index(){
        ViewResult vr = new ViewResult();
        return vr;
    }
}
