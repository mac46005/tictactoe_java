package com.preciado.utilities.console.mvc.models;


import com.preciado.utilities.console.mvc.BaseApp;

public class TerminateResult extends ActionResult {
    @Override
    public void executeResult() {
        BaseApp.close();
    }
}
