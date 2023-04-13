package com.preciado.utilities.console.mvc.models;

import com.preciado.utilities.console.mvc.interfaces.IEventListener;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

public class Event extends EventObject {
    private List<IEventListener> listeners = new ArrayList<>();

    private Object data;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public Event(Object source, Object data) {
        super(source);
        this.data = data;
    }

    public Object getData(){
        return data;
    }

    public void addListener(IEventListener listener){
        listeners.add(listener);
    }
    public void removeListener(IEventListener listener){
        listeners.remove(listener);
    }
    public void raiseEvent(EventArgs args){
        for(IEventListener listener : listeners){
            listener.onEventRaised(args);
        }
    }
}
