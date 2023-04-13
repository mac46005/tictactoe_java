package com.preciado.tictactoe;

import com.google.common.reflect.Reflection;
import com.preciado.tictactoe.controllers.HomeController;
import com.preciado.utilities.console.mvc.Configuration;
import com.preciado.utilities.console.mvc.interfaces.IConfiguration;
import com.preciado.utilities.console.mvc.models.Router;

public class Main{
    public static void main(String[] args) {
        IConfiguration configuration = new Configuration();
        configuration.setStartRoute(HomeController.class.toString());

        Router router = new Router();
        router.registerRoute(HomeController.class.toString(), new HomeController());

        TicTacToe ticTacToe = (TicTacToe) new TicTacToe()
                .addConfiguration(configuration)
                .addRouter(router);


        ticTacToe.run(args);
    }
}