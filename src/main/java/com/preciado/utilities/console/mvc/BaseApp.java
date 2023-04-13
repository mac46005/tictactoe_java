package com.preciado.utilities.console.mvc;

import com.preciado.IApp;
import com.preciado.utilities.console.mvc.interfaces.IConfiguration;
import com.preciado.utilities.console.mvc.models.Router;
import com.preciado.utilities.console.mvc.models.Engine;

public abstract class BaseApp implements IApp {
    private Engine engine;
    protected Router router;
    protected IConfiguration configuration;



    protected static boolean IS_RUNNING = true;
    public static void close(){
        IS_RUNNING = false;
    }






    public  BaseApp addRouter(Router router){
        this.router = router;
        return this;
    }
    public BaseApp addConfiguration(IConfiguration configuration){
        this.configuration = configuration;
        return this;
    }






    @Override
    public void run(String[] args) {
        if(configuration != null){
            if(!configuration.getStartController().equals("")){
                router.setCurrentRoute(configuration.getStartController());
            }
        }
        engine.setRouter(router);

        engine.running();
    }
}
