package com.preciado.utilities.console.mvc.models;

public class EventArgs {
    private Object source;
    public EventArgs(Object source){
        this.source = source;
    }
    public Object getSource(){
        return source;
    }
}
