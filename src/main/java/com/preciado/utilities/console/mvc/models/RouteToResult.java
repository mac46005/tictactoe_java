package com.preciado.utilities.console.mvc.models;


import com.preciado.utilities.console.mvc.enums.DisplayMode;

public class RouteToResult extends ActionResult {

    private String route;

    public RouteToResult(String route) {
        this.route = route;
    }
    public String getRoute(){
        return route;
    }
    @Override
    public void executeResult() {

    }
}
