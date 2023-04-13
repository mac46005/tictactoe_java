package com.preciado.tictactoe.controllers;

import com.preciado.tictactoe.views.HomeView;
import com.preciado.utilities.console.mvc.interfaces.IController;
import com.preciado.utilities.console.mvc.models.ActionResult;
import com.preciado.utilities.console.mvc.models.ViewResult;

public class HomeController implements IController {
    @Override
    public ActionResult index() {
        return new ViewResult(new HomeView());
    }
}
