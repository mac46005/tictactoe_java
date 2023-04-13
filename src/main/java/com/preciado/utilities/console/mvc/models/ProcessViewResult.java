package com.preciado.utilities.console.mvc.models;

public class ProcessViewResult {
    public void renderView(ViewResult viewResult)
    {
        viewResult.executeResult();
    }
}
