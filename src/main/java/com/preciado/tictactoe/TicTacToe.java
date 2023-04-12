package com.preciado.tictactoe;

import com.preciado.IApp;
import com.preciado.utilities.console.mvc.App;
import com.preciado.utilities.console.mvc.interfaces.IConfiguration;
import com.preciado.utilities.console.mvc.models.Router;

public class TicTacToe extends App {
    private static boolean IS_RUNNING = true;

    @Override
    protected App addRouter(Router router) {
        this.router = router;
        return this;
    }

    @Override
    protected App addConfiguration(IConfiguration configuration) {
        return null;
    }
}
