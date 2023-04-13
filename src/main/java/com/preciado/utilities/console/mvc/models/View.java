package com.preciado.utilities.console.mvc.models;

import com.preciado.utilities.console.mvc.interfaces.IView;

import java.util.Scanner;

public class View implements IView {
    protected StringBuilder viewBuilder = new StringBuilder();
    protected Scanner scanner = new Scanner(System.in);
    protected String buffer = "";
    @Override
    public void display() {
        printOutput("Hello World!");
        scanner.nextLine();
    }


    private String getInput(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private void printOutput(String output){
        System.out.println(output);
    }

}
