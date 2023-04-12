package com.preciado.utilities.console.mvc.models;

import com.preciado.utilities.console.mvc.interfaces.IController;

import java.util.Dictionary;
import java.util.Hashtable;

public class Router {
    String currentRoute = "";
    IController currentController = null;
    private Dictionary<String, IController> router = new Hashtable<>();

    public Router() {

    }
    public Router registerRoute(String route, IController controller){
        router.put(route, controller);
        return this;
    }
    public IController getController(String route){
        return router.get(route);
    }
}
