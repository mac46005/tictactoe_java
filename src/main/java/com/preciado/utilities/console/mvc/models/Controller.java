package com.preciado.utilities.console.mvc.models;

import com.preciado.utilities.console.mvc.enums.DisplayMode;
import com.preciado.utilities.console.mvc.interfaces.IController;
import com.preciado.utilities.console.mvc.interfaces.INavigator;

public abstract class Controller implements IController {
    DisplayMode displayMode;
    Object context;
    public abstract ActionResult index();
    protected RouteToResult routetoResult(String route){
        return new RouteToResult(route);
    }
    protected abstract ViewResult viewResult();
}
