package com.preciado.tictactoe.models;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    Engine engine;
    Tire tire;
    @Inject
    public Car(Engine engine, Tire tire) {
        this.engine = engine;
        this.tire = tire;
    }
    
    public void drive(){
        System.out.println("Driving...");
    }
}
