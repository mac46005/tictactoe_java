package com.preciado.utilities.console.mvc;

import com.preciado.IApp;
import com.preciado.utilities.console.mvc.interfaces.IConfiguration;
import com.preciado.utilities.console.mvc.models.Router;
import com.preciado.utilities.console.mvc.models.Engine;

public abstract class App implements IApp {
    private Engine engine;
    protected static boolean IS_RUNNING = true;
    public static void close(){
        IS_RUNNING = false;
    }
    protected Router router;
    protected IConfiguration configuration;
    protected abstract App addRouter(Router router);
    protected abstract App addConfiguration(IConfiguration configuration);

    @Override
    public void run(String[] args) {

        engine.setRouter(router);

        while(engine.running()){

        }
    }
}
