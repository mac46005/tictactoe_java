package com.preciado.utilities.console.mvc.models;

import com.preciado.utilities.console.mvc.interfaces.IView;

public class Engine {
    private IView view;
    private Router router;
    public Engine(Router router) {
        this.router = router;
    }

    public void renderView(){
        view.display();
    }
    public boolean running(){
        while(inGear()){//still on controller
            if(gearChanged()){//an event fired where controller is changing?
                changeGear();//change controller
            }else{
                onGear();//still on controller
            }
        }
    }

    private void runGear(){

    }
    //will have to change several times yikes
    private void changeGear(ActionResult result){
        if(result instanceof ActionResult){

        } else if (result instanceof ViewResult) {

        }else{

        }
    }

    public void setRouter(Router router){
        this.router = router;
    }
}
