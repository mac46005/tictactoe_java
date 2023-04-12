package com.preciado.tictactoe;

import com.google.common.reflect.Reflection;
import com.preciado.tictactoe.controllers.HomeController;
import com.preciado.utilities.console.mvc.models.Router;

public class Main{
    public static void main(String[] args) {

        Router router = new Router();

        router.registerRoute("home/index", new HomeController());

        TicTacToe ticTacToe = (TicTacToe) new TicTacToe()
                .addRouter(router);


        ticTacToe.run(args);
    }
}