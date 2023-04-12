package com.preciado.utilities.console.mvc.models;

import java.util.StringTokenizer;

public class RouteData {
    private String controllerName;

    public RouteData(String controllerName) {
        this.controllerName = controllerName;
    }

    public String getControllerName(){
        return controllerName;
    }
}
