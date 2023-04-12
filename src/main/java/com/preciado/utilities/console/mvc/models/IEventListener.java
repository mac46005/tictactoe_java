package com.preciado.utilities.console.mvc.models;

import java.util.EventListener;

public interface IEventListener extends EventListener {
    void onEventRaised(EventArgs args);
}
