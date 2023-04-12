package com.preciado.utilities.console.mvc.interfaces;

import com.preciado.utilities.console.mvc.models.Event;

public interface INavigator {
    void navigateTo(String route);
    void navigateTo(String route, Object data);
}
