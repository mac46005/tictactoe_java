package com.preciado.utilities.console.mvc.interfaces;

import com.preciado.utilities.console.mvc.models.EventArgs;

import java.util.EventListener;

public interface IEventListener extends EventListener {
    void onEventRaised(EventArgs args);
}
