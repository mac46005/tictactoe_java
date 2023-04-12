package com.preciado.utilities.console.mvc.models;

import com.preciado.utilities.console.mvc.interfaces.IView;

public class ViewResult extends ActionResult {
    IView view;
    public ViewResult(IView view){
        this.view = view;
    }

    @Override
    public void ExecuteResult(ControllerContext context) {
        view.display();
    }
}
