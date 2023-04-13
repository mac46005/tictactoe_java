package com.preciado.utilities.console.mvc.models;

import com.preciado.utilities.console.mvc.interfaces.IEventListener;

public class Engine {

    IEventListener onShiftingGear;
    private Router router;
    private ProcessViewResult processViewResult = new ProcessViewResult();

    public Engine(Router router) {
        this.router = router;


        onShiftingGear = this::shiftingGear;
    }


    public void shiftingGear(EventArgs eventArgs){
        ActionResult result = (ActionResult)eventArgs.getSource();

    }
    public boolean inGear(){
        if(router.routeSet()){
            isInGear = false;
        }

        return isInGear;
    }



    private void drive(){
        ActionResult result = router
                .getCurrentController()
                .index();

        process(result);
    }




    private boolean gearChanged(){
        isGearChanged = router.getHasRouteChanged();

        return isGearChanged;
    }







    private void process(ActionResult result){
        if(result instanceof ActionResult){

        } else if (result instanceof ViewResult) {
            processViewResult.renderView((ViewResult) result);
        }else if (result instanceof RouteToResult) {
            RouteToResult routeToResult = (RouteToResult) result;

            router.setCurrentRoute(routeToResult.getRoute());
        }else if(result instanceof TerminateResult){

        }
    }





    //will have to change several times yikes
    private void changeGear(String gear){
        router.setCurrentRoute(gear);
    }




    public void setRouter(Router router){
        this.router = router;
    }









    boolean isInGear = true, isGearChanged, buf2, buf3, buf4;
    RouteToResult routeBuf = null;

    public void running(){
        while(inGear()){//still on controller
            if(gearChanged()){//an event fired where controller is changing?
                String gear = routeBuf.getRoute();
                changeGear(gear);//change controller
                routeBuf = null;
            }else{
                drive();//still on controller
            }
        }
    }
}
