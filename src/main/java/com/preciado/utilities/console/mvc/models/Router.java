package com.preciado.utilities.console.mvc.models;

import com.preciado.utilities.console.mvc.interfaces.IController;

import java.util.Dictionary;
import java.util.Hashtable;

public class Router {
    boolean hasRouteChanged = false;
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
    public IController getCurrentController(){
        if(!currentRoute.equals("")){
            hasRouteChanged = false;
            return router.get(currentRoute);
        }
        return null;
    }
    public void setCurrentRoute(String route){
        if(!currentRoute.equals(route)){
            this.currentRoute = route;
            hasRouteChanged = true;
        }
    }

    public boolean routeSet(){
        if(this.currentRoute.equals("")){
            return false;
        }
        return true;
    }
    public boolean getHasRouteChanged(){
        return this.hasRouteChanged;
    }
}
